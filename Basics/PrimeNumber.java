package Basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=s.nextInt();

        for(int i=2;i<n;i++){
            if(n%i==0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime Number");
    }
}


