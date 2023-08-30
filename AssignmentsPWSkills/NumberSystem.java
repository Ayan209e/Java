package AssignmentsPWSkills;

import java.util.Scanner;

public class NumberSystem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

//        Q1. Decimal To Binary
/*

        System.out.print("Enter Number: ");
        int n=s.nextInt();
        int bit,ans=0,pw=1;

        while(n>0){
                bit=n%2;
                ans += bit*pw;
                n=n/2;
                pw *=10;

        }
        System.out.println("Binary: " + ans);
*/


//        Q2. Binary To Decimal
/*
        System.out.print("Enter Number: ");
        int n=s.nextInt();
        int bit,ans=0,pw=1;
        while(n>0){
            bit=n%10;
            ans += bit*pw;
            pw *=2;
            n=n/10;
        }
        System.out.println("Decimal: " + ans);

        */

//        Q3. Add Two Numbers( 1st is Decimal, 2nd is Binary)
/*
        System.out.println("Enter Numbers: ");
        int a=s.nextInt();
        int b=s.nextInt();
        int bit,decimal=0,pw=1;
        while(b>0){
            bit=b%10;
            decimal += bit*pw;
            pw *=2;
            b=b/10;
        }

        int ans= a+ decimal;
        System.out.println("Sum: " + ans);
        */

//        Q4. Multiply Two Numbers With Different Base
/*

        System.out.println("Enter Numbers: ");
        int a=s.nextInt();
        int b=s.nextInt();
        int bit,decimal=0,pw=1;
        while(b>0){
            bit=b%10;
            decimal += bit*pw;
            pw *=2;
            b=b/10;
        }

        int ans= a * decimal;
        System.out.println("Product: " + ans);
*/

//        Q5. Decimal Double Into Binary String upto K precision
//        To Be Done

    }
}
