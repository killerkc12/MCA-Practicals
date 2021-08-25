package NumberSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal Number : ");
        long n = sc.nextLong();
        Decimal decimal = new Decimal();
        decimal.DecimalToBinary(n);
        long octal = decimal.DecimalToOctal(n);
        System.out.println("Ocatal : "+octal);

        System.out.print("Enter the Binary Number : ");
        n = sc.nextLong();
        Binary binary = new Binary();
        System.out.println("Decimal : "+binary.BinaryToDecimal(n));
        System.out.println("Ocatal : "+binary.BinaryToOctal(n));
    }
}
