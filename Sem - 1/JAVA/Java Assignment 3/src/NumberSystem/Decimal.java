package NumberSystem;

import java.util.Scanner;

public class Decimal {
    public long DecimalToBinary(long decimal){
        long binary[] = new long[50];
        int i = 0;
        while (decimal > 0){
            binary[i++] = decimal % 2;
            decimal /= 2;
        }
        System.out.print("Binary : ");
        for (int j = i-1;j>=0;j--)
            System.out.print(binary[j]+" ");
        System.out.println();
        return 0;
    }

    public long DecimalToOctal(long decimal){
        int i = 1;
        long octal = 0;
        while (decimal!=0){
            octal += (decimal % 8) * i;
            decimal /=8;
            i *=10;
        }
        return octal;
    }
}
