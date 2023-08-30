package Basics;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int n=s.nextInt();
        int binary=0;
        int pw=1;
        while(n>0){
             int digit=n%2;
             binary+=digit*pw;
             pw*=10;
             n/=2;
         }
        System.out.println("Binary Number: "+ binary);


    }

}
