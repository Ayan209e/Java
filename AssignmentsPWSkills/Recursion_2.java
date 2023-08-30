package AssignmentsPWSkills;

import java.util.Scanner;

public class Recursion_2 {

    static int pow(int a,int b){
        if(b==1){
            return a;
        }
        if(b%2==0){
            return pow(a,b/2) * pow(a,b/2);
        }
        return a * pow(a,b/2) * pow(a,b/2);
    }
    static int isArmstrong(int n,int dig){
        if(n==0){
            return 0;
        }
        return pow(n%10,dig) +isArmstrong(n/10,dig);
    }

    static int product(int x,int y){
        if(x<y){
            return product(y,x);
        }
        else if(y!=0){
            return x+ product(x,y-1);
        }
        else{
            return 0;
        }
    }

    static boolean isPrime(int n,int i){
        if(n<=2){
            return (n==2)?true:false;
        }
        if(n%i==0){
            return false;
        }
        if(i*i>n){
            return true;
        }
        return isPrime(n,i+1);
    }

    static int binary(int n){
        if(n==0){return 0;}
        return n%2 + (10*binary(n/2));
    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);


//        Q1 - Given a number n. Print if it is an armstrong number or not. An armstrong number is a number if the sum
//        of every digit in that number raised to the power of total digits in that number is equal to the number.
/*
        System.out.print("Enter Number: ");
        int n=s.nextInt();
        int temp=n;
        int cnt=0;
        while(temp>0){
            cnt++;
            temp/=10;
        }

        if(n==isArmstrong(n,cnt)){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong");
        }
        */

//
//        Q2 - Given two number x and y find product using recursion.
/*

        System.out.print("Enter Numbers: ");
        int x=s.nextInt();
        int y=s.nextInt();
        System.out.println("Product: " + product(x,y));
*/

//        Q3 - Given a number n, check whether it's a prime number or not using recursion.
/*

        System.out.print("Enter Numbers: ");
        int x=s.nextInt();
        if(isPrime(x,2)){
            System.out.println("Prime");
        }
        else {
            System.out.println("Non Prime");
        }
*/

//        Q4 - Given a decimal number as input, we need to write a program to convert the given decimal number into its
//        equivalent binary number.
//
//        System.out.print("Enter Numbers: ");
//        int n=s.nextInt();
//        System.out.println("Binary Of " + n +" Is: " + binary(n));

//
//
//
//       
//
    }
}
