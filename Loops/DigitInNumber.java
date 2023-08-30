package Loops;

import java.util.Scanner;

public class DigitInNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=s.nextInt();
        int cnt=0;
        while (n>0){
            n=n/10;
            cnt++;
        }
        System.out.println("Number Of Digits Are: "+ cnt);
    }

}
