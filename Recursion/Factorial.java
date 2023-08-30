package Recursion;

import java.util.Scanner;

public class Factorial {

    static int fact(int n){
        if(n==1){
            return 1;
        }
        int ans=n*fact(n-1);
        return ans;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=s.nextInt();
        System.out.println("Factorial Of " + n + " Is: " + fact(n));
    }
}
