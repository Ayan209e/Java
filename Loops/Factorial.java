package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=s.nextInt();
        int fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial: "+fact);
    }
}
