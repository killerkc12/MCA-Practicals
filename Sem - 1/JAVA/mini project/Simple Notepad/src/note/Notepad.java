package note;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class FileOperation
{
    Notepad npd;

    boolean saved;
    boolean newFileFlag;
    String fileName;
    String applicationTitle="Java Notepad";

    File fileRef;
    JFileChooser chooser;

    boolean isSave(){return saved;}
    void setSave(boolean saved){this.saved=saved;}
    String getFileName(){return new String(fileName);}
    void setFileName(String fileName){this.fileName=new String(fileName);}

    FileOperation(Notepad npd)
    {
        this.npd=npd;

        saved=true;
        newFileFlag=true;
        fileName=new String("Untitled");
        fileRef=new File(fileName);
        this.npd.f.setTitle(fileName+" - "+applicationTitle);

        chooser=new JFileChooser();
        chooser.addChoosableFileFilter(new MyFileFilter(".java","Java Source Files(*.java)"));
        chooser.addChoosableFileFilter(new MyFileFilter(".txt","Text Files(*.txt)"));
        chooser.setCurrentDirectory(new File("."));

    }

    boolean saveFile(File temp)
    {
        FileWriter fout=null;
        try
        {
            fout=new FileWriter(temp);
            fout.write(npd.ta.getText());
        }
        catch(IOException ioe){updateStatus(temp,false);return false;}
        finally
        {try{fout.close();}catch(IOException excp){}}
        updateStatus(temp,true);
        return true;
    }

    boolean saveThisFile()
    {

        if(!newFileFlag)
        {return saveFile(fileRef);}

        return saveAsFile();
    }

    boolean saveAsFile()
    {
        File temp=null;
        chooser.setDialogTitle("Save As...");
        chooser.setApproveButtonText("Save Now");
        chooser.setApproveButtonMnemonic(KeyEvent.VK_S);
        chooser.setApproveButtonToolTipText("Click me to save!");

        do
        {
            if(chooser.showSaveDialog(this.npd.f)!=JFileChooser.APPROVE_OPTION)
                return false;
            temp=chooser.getSelectedFile();
            if(!temp.exists()) break;
            if(   JOptionPane.showConfirmDialog(
                    this.npd.f,"<html>"+temp.getPath()+" already exists.<br>Do you want to replace it?<html>",
                    "Save As",JOptionPane.YES_NO_OPTION
            )==JOptionPane.YES_OPTION)
                break;
        }while(true);


        return saveFile(temp);
    }


    boolean openFile(File temp)
    {
        FileInputStream fin=null;
        BufferedReader din=null;

        try
        {
            fin=new FileInputStream(temp);
            din=new BufferedReader(new InputStreamReader(fin));
            String str=" ";
            while(str!=null)
            {
                str=din.readLine();
                if(str==null)
                    break;
                this.npd.ta.append(str+"\n");
            }

        }
        catch(IOException ioe){updateStatus(temp,false);return false;}
        finally
        {try{din.close();fin.close();}catch(IOException excp){}}
        updateStatus(temp,true);
        this.npd.ta.setCaretPosition(0);
        return true;
    }

    void openFile()
    {
        if(!confirmSave()) return;
        chooser.setDialogTitle("Open File...");
        chooser.setApproveButtonText("Open this");
        chooser.setApproveButtonMnemonic(KeyEvent.VK_O);
        chooser.setApproveButtonToolTipText("Click me to open the selected file.!");

        File temp=null;
        do
        {
            if(chooser.showOpenDialog(this.npd.f)!=JFileChooser.APPROVE_OPTION)
                return;
            temp=chooser.getSelectedFile();

            if(temp.exists())	break;

            JOptionPane.showMessageDialog(this.npd.f,
                    "<html>"+temp.getName()+"<br>file not found.<br>"+
                            "Please verify the correct file name was given.<html>",
                    "Open",	JOptionPane.INFORMATION_MESSAGE);

        } while(true);

        this.npd.ta.setText("");

        if(!openFile(temp))
        {
            fileName="Untitled"; saved=true;
            this.npd.f.setTitle(fileName+" - "+applicationTitle);
        }
        if(!temp.canWrite())
            newFileFlag=true;

    }
    ////////////////////////
    void updateStatus(File temp,boolean saved)
    {
        if(saved)
        {
            this.saved=true;
            fileName=new String(temp.getName());
            if(!temp.canWrite())
            {fileName+="(Read only)"; newFileFlag=true;}
            fileRef=temp;
            npd.f.setTitle(fileName + " - "+applicationTitle);
            npd.statusBar.setText("File : "+temp.getPath()+" saved/opened successfully.");
            newFileFlag=false;
        }
        else
        {
            npd.statusBar.setText("Failed to save/open : "+temp.getPath());
        }
    }

    boolean confirmSave()
    {
        String strMsg="<html>The text in the "+fileName+" file has been changed.<br>"+
                "Do you want to save the changes?<html>";
        if(!saved)
        {
            int x=JOptionPane.showConfirmDialog(this.npd.f,strMsg,applicationTitle,JOptionPane.YES_NO_CANCEL_OPTION);

            if(x==JOptionPane.CANCEL_OPTION) return false;
            if(x==JOptionPane.YES_OPTION && !saveAsFile()) return false;
        }
        return true;
    }

    void newFile()
    {
        if(!confirmSave()) return;

        this.npd.ta.setText("");
        fileName=new String("Untitled");
        fileRef=new File(fileName);
        saved=true;
        newFileFlag=true;
        this.npd.f.setTitle(fileName+" - "+applicationTitle);
    }

}// end defination of class FileOperation

public class Notepad  implements ActionListener, MenuConstants
{

    JFrame f;
    JTextArea ta;
    JLabel statusBar;

    private String fileName="Untitled";
    private boolean saved=true;
    String applicationName="Java Notepad";

    String searchString, replaceString;
    int lastSearchIndex;

    FileOperation fileHandler;

    Notepad()
    {
        f=new JFrame(fileName+" - "+applicationName);
        ta=new JTextArea(30,60);
        statusBar=new JLabel("||       Ln 1, Col 1  ",JLabel.RIGHT);
        f.add(new JScrollPane(ta),BorderLayout.CENTER);
        f.add(statusBar,BorderLayout.SOUTH);
        f.add(new JLabel("  "),BorderLayout.EAST);
        f.add(new JLabel("  "),BorderLayout.WEST);
        createMenuBar(f);

        f.pack();
        f.setLocation(100,50);
        f.setVisible(true);
        f.setLocation(150,50);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        fileHandler=new FileOperation(this);



        ta.addCaretListener(
                new CaretListener()
                {
                    public void caretUpdate(CaretEvent e)
                    {
                        int lineNumber=0, column=0, pos=0;

                        try
                        {
                            pos=ta.getCaretPosition();
                            lineNumber=ta.getLineOfOffset(pos);
                            column=pos-ta.getLineStartOffset(lineNumber);
                        }catch(Exception excp){}
                        if(ta.getText().length()==0){lineNumber=0; column=0;}
                        statusBar.setText("||       Ln "+(lineNumber+1)+", Col "+(column+1));
                    }
                });

        DocumentListener myListener = new DocumentListener()
        {
            public void changedUpdate(DocumentEvent e){fileHandler.saved=false;}
            public void removeUpdate(DocumentEvent e){fileHandler.saved=false;}
            public void insertUpdate(DocumentEvent e){fileHandler.saved=false;}
        };
        ta.getDocument().addDocumentListener(myListener);

        WindowListener frameClose=new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                if(fileHandler.confirmSave())System.exit(0);
            }
        };
        f.addWindowListener(frameClose);
    }

    void goTo()
    {
        int lineNumber=0;
        try
        {
            lineNumber=ta.getLineOfOffset(ta.getCaretPosition())+1;
            String tempStr=JOptionPane.showInputDialog(f,"Enter Line Number:",""+lineNumber);
            if(tempStr==null)
            {return;}
            lineNumber=Integer.parseInt(tempStr);
            ta.setCaretPosition(ta.getLineStartOffset(lineNumber-1));
        }catch(Exception e){}
    }

    public void actionPerformed(ActionEvent ev)
    {
        String cmdText=ev.getActionCommand();

        if(cmdText.equals(fileNew))
            fileHandler.newFile();
        else if(cmdText.equals(fileOpen))
            fileHandler.openFile();

        else if(cmdText.equals(fileSave))
            fileHandler.saveThisFile();

        else if(cmdText.equals(fileSaveAs))
            fileHandler.saveAsFile();

        else if(cmdText.equals(fileExit))
        {if(fileHandler.confirmSave())System.exit(0);}

        else
            statusBar.setText("This "+cmdText+" command is yet to be implemented");
    }//action Performed

    JMenuItem createMenuItem(String s, int key,JMenu toMenu,ActionListener al)
    {
        JMenuItem temp=new JMenuItem(s,key);
        temp.addActionListener(al);
        toMenu.add(temp);

        return temp;
    }

    JMenuItem createMenuItem(String s, int key,JMenu toMenu,int aclKey,ActionListener al)
    {
        JMenuItem temp=new JMenuItem(s,key);
        temp.addActionListener(al);
        temp.setAccelerator(KeyStroke.getKeyStroke(aclKey,ActionEvent.CTRL_MASK));
        toMenu.add(temp);

        return temp;
    }

    JCheckBoxMenuItem createCheckBoxMenuItem(String s, int key,JMenu toMenu,ActionListener al)
    {
        JCheckBoxMenuItem temp=new JCheckBoxMenuItem(s);
        temp.setMnemonic(key);
        temp.addActionListener(al);
        temp.setSelected(false);
        toMenu.add(temp);

        return temp;
    }

    JMenu createMenu(String s,int key,JMenuBar toMenuBar)
    {
        JMenu temp=new JMenu(s);
        temp.setMnemonic(key);
        toMenuBar.add(temp);
        return temp;
    }

    void createMenuBar(JFrame f)
    {
        JMenuBar mb=new JMenuBar();
        JMenuItem temp;

        JMenu fileMenu=createMenu(fileText,KeyEvent.VK_F,mb);

        createMenuItem(fileNew,KeyEvent.VK_N,fileMenu,KeyEvent.VK_N,this);
        createMenuItem(fileOpen,KeyEvent.VK_O,fileMenu,KeyEvent.VK_O,this);
        createMenuItem(fileSave,KeyEvent.VK_S,fileMenu,KeyEvent.VK_S,this);
        createMenuItem(fileSaveAs,KeyEvent.VK_A,fileMenu,this);
        fileMenu.addSeparator();
        fileMenu.addSeparator();
        createMenuItem(fileExit,KeyEvent.VK_X,fileMenu,this);



        MenuListener editMenuListener=new MenuListener()
        {
            public void menuSelected(MenuEvent evvvv)
            {

            }
            public void menuDeselected(MenuEvent evvvv){}
            public void menuCanceled(MenuEvent evvvv){}
        };
        f.setJMenuBar(mb);
    }

    public static void main(String[] s)
    {
        new Notepad();
    }
}

interface MenuConstants
{
    final String fileText="File";

    final String fileNew="New";
    final String fileOpen="Open...";
    final String fileSave="Save";
    final String fileSaveAs="Save As...";
    final String fileExit="Exit";

}