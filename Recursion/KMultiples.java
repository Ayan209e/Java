package Recursion;

import java.util.Scanner;

public class KMultiples {

    public static void kMultiple(int n,int k){
        if(k==1){
            System.out.print(n + " ");
            return;
        }
        kMultiple(n,k-1);
        System.out.print(n*k + " ");

    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=s.nextInt();
        System.out.print("Enter K: ");
        int k=s.nextInt();
        System.out.println("First " + k + " Multiples Of " + n + " Are:");
        kMultiple(n,k);

    }
}
