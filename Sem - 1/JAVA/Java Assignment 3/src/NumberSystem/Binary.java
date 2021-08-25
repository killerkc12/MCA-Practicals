package NumberSystem;

import java.util.Scanner;

public class Binary {

    public long BinaryToDecimal(long n){
        long decimal = 0;
        long temp = n;
        int i = 0;
        while (temp>0){
            decimal += (temp % 10) * Math.pow(2,i++);
            temp /= 10;
        }
        return decimal;
    }
    
    public long BinaryToOctal(long d){
        long decimal = BinaryToDecimal(d);
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
