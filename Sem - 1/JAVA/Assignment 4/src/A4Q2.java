import java.io.*;
import java.util.Scanner;

public class A4Q2 {
    public static void main(String[] args) throws FileNotFoundException {
        int cnt=0;int counter=0;
        Scanner sc = new Scanner(new File("Cricket.csv"));
        Scanner sc1 = new Scanner(new File("Cricket.csv"));
        System.out.println("Answer of 1st question:");
        if(sc.hasNextLine()){
            String[] line = sc.nextLine().split(",");
            System.out.println(line[0]+"     "+line[2]+"     "+line[5]);
            System.out.println("");
        }
        while(sc.hasNextLine())
        {
            String[] lines = sc.nextLine().split(",");
            System.out.println(lines[0]+"     "+lines[2]+"     "+lines[5]);
            cnt++;
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Answer of 2nd question:");
        String[] line1 = sc1.nextLine().split(",");
        if(sc1.hasNextLine()){
            System.out.println(line1[5]+"     Count");
            System.out.println("");
        }
        for(int i=0;i<=cnt-1;i++){
            counter=0;
            String name=null;
            Scanner sc3 = new Scanner(new File("Cricket.csv"));
            if(sc1.hasNextLine()){
                line1 = sc1.nextLine().split(",");
                name=line1[5];
                for(int j=0;j<=cnt;j++){
                    if(sc3.hasNextLine()){
                        String line3[] = sc3.nextLine().split(",");
                        if(name.equals(line3[5])){
                            counter++;
                        }
                    }}
            }System.out.println(name+"     "+counter);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Answer of 3rd question:");

        System.out.println("India     Count     Margin");
        System.out.println("");


        counter=0;
        String name=null;
        Scanner sc4 = new Scanner(new File("Cricket.csv"));
        String line3[]=null;
        for(int j=0;j<=cnt;j++){
            if(sc4.hasNextLine()){
                line3 = sc4.nextLine().split(",");
                if("India".equals(line3[5])){
                    counter++;
                }

            }    if("India".equals(line3[5])){
                System.out.println("India"+"     "+counter+"     "+line3[6]);
            }}
    }
}
