package Recursion;

import java.util.Scanner;

public class LCM {

    public static int lcm(int x,int y){
        int gcd=gcd(x,y);
        return (x*y)/gcd;
    }

    public static int gcd(int x,int y){
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
        System.out.println("LCM Of " + x + " And " + y + " Is: "+ lcm(x,y));
    }
}
