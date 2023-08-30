package Loops;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Numeber: ");
        int n=s.nextInt();
        int digit,ans=0;
        while (n>0){
            digit=n%10;
            ans=(ans*10)+digit;
            n=n/10;
        }
        System.out.println("Reverse Of Number: "+ ans);
    }
}
