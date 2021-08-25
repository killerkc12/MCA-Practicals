import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class A6Q4 extends Applet implements ItemListener, ActionListener {

    String font[] = {"Times New Roman","Sans Serif","Lucida Console","Arial"};
    String size[] = {"10","12","14","16","18","20","22","24","26","28","30"};
    JComboBox cb;
    JList list;
    JRadioButton bold,italic,plain;
    JLabel l;
    ArrayList<Integer> arrayList ;
    int fontSize;

    public void init() {
        fontSize = 15;
        cb = new JComboBox(font);
        l = new JLabel("This is the Applet!");
        list = new JList(size);
        bold = new  JRadioButton("Bold");
        italic = new JRadioButton("Italic");
        plain = new JRadioButton("Plain");
        add(cb);
        add(bold);
        add(italic);
        add(plain);
        add(list);
        add(l);
        cb.addItemListener(this::itemStateChanged);
        bold.addActionListener(this);
        italic.addActionListener(this);
        plain.addActionListener(this);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String data;
                if(list.getSelectedIndex()!=-1){
                    data = (String) list.getSelectedValue();
                    fontSize = Integer.parseInt(data);
                    String str = new String();
                    Font f = new Font(str,Font.PLAIN,fontSize);
                    l.setFont(f);
                }
            }
        });
    }

    public void itemStateChanged(ItemEvent e) {
        Object obj = e.getItem();
        String str = (String) obj;
        Font f = new Font(str,Font.PLAIN,fontSize);
        l.setFont(f);
    }

    public void actionPerformed(ActionEvent e) {
        if ((bold.isSelected())){
            String str =new String() ;
            Font f = new Font(str,Font.BOLD,fontSize);
            l.setFont(f);
        }
        if(italic.isSelected()){
            String str =new String() ;
            Font f = new Font(str,Font.ITALIC,fontSize);
            l.setFont(f);
        }
        if(plain.isSelected()){
            String str =new String() ;
            Font f = new Font(str,Font.PLAIN,fontSize);
            l.setFont(f);
        }
    }
}
