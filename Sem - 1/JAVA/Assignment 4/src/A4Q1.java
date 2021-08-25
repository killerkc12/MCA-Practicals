import java.io.*;
import java.util.Scanner;

public class A4Q1 {
    public static void main(String[] args) throws Exception {
        int c;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the First File Name : ");
            String file1 = sc.nextLine();
            System.out.print("Enter the Second File Name : ");
            String file2 = sc.nextLine();

            FileInputStream fis = new FileInputStream(file1);
            FileOutputStream fos = new FileOutputStream(file2);
            if(fis!=null){
                fos = new FileOutputStream(file2);
                while ((c = fis.read()) != -1) {
                    if(c==' '){
                        c='_';
                    }
                    fos.write(c);
                }
                System.out.print("File Copied.");
            }else{
                System.out.print("File does not exists.");
            }
        }catch (Exception e){
            System.out.println("File not Found");
        }
    }
}
