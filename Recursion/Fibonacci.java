package Recursion;

import java.util.Scanner;

public class Fibonacci {

    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }

        return fib(n-1) + fib(n-2);

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=s.nextInt();

//       nth Fib number
//        int ans=fib(n);
//        System.out.println(n + "th Fibonacci Number: " + ans);

//        First n fib numbers
        for(int i=0;i<=n;i++){
            System.out.print(fib(i) + " ");
        }
    }
}
