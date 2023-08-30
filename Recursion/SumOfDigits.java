package Recursion;

import java.util.Scanner;

public class SumOfDigits {

    static int sumOfDigit(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sumOfDigit(n/10);
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=s.nextInt();
        System.out.println("Sum Of Digits: " + sumOfDigit(n));
    }


}
