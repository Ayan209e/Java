package Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=s.nextInt();
        int digit,sum=0;
        while(n>0){
            digit=n%10;
            sum+=digit;
            n=n/10;
        }
        System.out.println("Sum Of Digits: "+ sum);
    }
}
