package Recursion;

import java.util.Scanner;

public class ReverseNumber {

    static int rev=0;

    static int reverse(int n){
        if(n<=0)return 0;
        rev=rev*10+n%10;
        return reverse(n/10);
    }

    static int rev(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    private static int helper(int n,int digit){
        if(n%10==n)return n;
        int rem=n%10;
        return rem* (int)Math.pow(10,digit-1) + helper(n/10,digit-1);
    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=s.nextInt();
//        reverse(n);
        System.out.println("Sum: " + rev(n));
    }
}
