package Recursion;

import java.util.Scanner;

public class GCD {

    public static int gcd(int x,int y){
//        Euclid's Algorithm:
//        gcd(x,y)=gcd(y,x%y) and gcd(x,0)=x

        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter X: ");
        int x=s.nextInt();
        System.out.print("Enter Y: ");
        int y=s.nextInt();
        System.out.println("GCD Of "+ x +" And " + y +" Is: " + gcd(x,y));
    }
}
