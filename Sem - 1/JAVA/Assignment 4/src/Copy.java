import java.io.*;
import java.util.*;
public class Copy{
    Copy(){
        Scanner sc=null;
        FileInputStream in = null;
        FileOutputStream out = null;
        String inputf=null;
        String ouputf=null;
        int c;
        try {
            sc = new Scanner(System.in);
            System.out.print("Input file name:");
            inputf=sc.nextLine();
            System.out.print("Ouput file name:");
            ouputf=sc.nextLine();
            in = new FileInputStream(inputf);
            if(in!=null){
                out = new FileOutputStream(ouputf);
                while ((c = in.read()) != -1) {
                    if(c==' '){
                        c='_';
                    }
                    out.write(c);
                }
                System.out.print("File Copied.");
            }else
            { System.out.print("File does not exists.");
            }
        }
        catch(Exception e){
            System.out.print("File not Found"+e);
        }
        finally {try{
            in.close();
            out.close();

        }catch(Exception e){
            System.out.print(""+e);
        }
        }

    }
    public static void main(String args[]) throws IOException {
        new Copy();
    }
}