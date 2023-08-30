package Recursion;

import java.util.Scanner;

public class SumOfFirstNNumbers {

    public static int sumOfFirstNNumbers(int n){
        if(n==1){
            return n;
        }
        int ans=n + sumOfFirstNNumbers(n-1);
        return ans;

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=s.nextInt();
        System.out.println("Sum Of First " + n + " Numbers: " +sumOfFirstNNumbers(n));
    }
}
