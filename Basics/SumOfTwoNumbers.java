package Basics;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter Numbers: ");
        int a=s.nextInt();
        int b=s.nextInt();
        int sum=a+b;
        System.out.println("Sum: "+ sum);
    }
}
