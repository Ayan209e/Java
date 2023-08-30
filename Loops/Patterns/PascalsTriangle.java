package Loops.Patterns;

import java.util.Scanner;

public class PascalsTriangle {

    static int fact(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static int combination(int n,int r){
        return fact(n)/(fact(r)*fact(n-r));
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=s.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(combination(i,j) +" ");
            }
            System.out.println();
        }
    }
}
