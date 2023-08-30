package Basics;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Binary Number: ");
        int n=s.nextInt();
        int digit;
        int decimal=0;
        int pw=1;
        while(n>0){
            digit=n%10;
            decimal+=digit*pw;
            pw*=2;
            n=n/10;
        }
        System.out.println("Decimal Number: " + decimal);

    }
}
