package Loops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Value Of Base: ");
        int a=s.nextInt();
        System.out.print("Enter Value Of Power: ");
        int b=s.nextInt();
        int ans=1;
        for(int i=1;i<=b;i++){
            ans*=a;
        }
        System.out.println("Answer: "+ ans);
    }
}
