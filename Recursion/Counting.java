package Recursion;

import java.util.Scanner;

public class Counting {

    public static void counting1ToN(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        counting1ToN(n-1);
        System.out.print(n + " ");
    }

    public static void countingNTo1(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        countingNTo1(n-1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter N:");
        int n=s.nextInt();
        System.out.println("Counting From 1 To N:");
        counting1ToN(n);
        System.out.println();
        System.out.println("Counting From N To 1:");
        countingNTo1(n);
    }
}
