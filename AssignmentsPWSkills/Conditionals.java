package AssignmentsPWSkills;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

//        Q1. Write a program which takes the values of length and breadth from user and check if it is a square or not.
       /*
        System.out.print("Enter Length: ");
        int l=s.nextInt();
        System.out.print("Enter Breadth: ");
        int b=s.nextInt();
        if(l==b){
            System.out.println("It Is A Square");
        }
        else{
            System.out.println("Not Square");
        }
*/

//        Q2. Write a program to print absolute value of a number entered by the user.
/*

        System.out.print("Enter Number: ");
        int n=s.nextInt();
        if(n<0){
            int ans= n * (-1);
            System.out.println("Absolute Value: "+ ans);
        }
        else{
            System.out.println("Absolute Value: " + n);
        }
*/

//        Q3. Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and calculate Profit or Loss.
/*

        System.out.print("Enter Cost Price: ");
        int cp=s.nextInt();
        System.out.print("Enter Selling Price: ");
        int sp=s.nextInt();

        int diff= sp - cp;
        if(diff>0){
            System.out.println("Profit: "+ diff);
        }
        else{
            System.out.println("Loss: "+ diff);
        }
*/

//        Q4. Write a program to print positive number entered by the user, if user enters a negative number, it is skipped
/*
        System.out.print("Enter Number: ");
        int n=s.nextInt();
        if(n<0){
            System.out.println("The Number Entered Is Either Negative Or Skipped!!!");
        }
        else{
            System.out.println("Valid Input");
        }
*/

//        Q5. Create a calculator using switch statement to perform addition, subtraction, multiplication and division.
/*
        System.out.print("Enter Number: ");
        int a=s.nextInt();
        System.out.print("Enter Operation: ");
        char op = s.next().charAt(0);
        System.out.print("Enter Number: ");
        int b=s.nextInt();
        int ans;
        switch (op){

            case '+':
                ans=a+b;
                System.out.println(a+ " " + op + " " + b + " = " + ans);
                break;

            case '-':
                ans=a-b;
                System.out.println(a+ " " + op + " " + b + " = " + ans);
                break;
            case '*':
                ans=a*b;
                System.out.println(a+ " " + op + " " + b + " = " + ans);
                break;
            case '/':
                ans=a/b;
                System.out.println(a+ " " + op + " " + b + " = " + ans);
                break;
            case '%':
                ans=a%b;
                System.out.println(a+ " " + op + " " + b + " = " + ans);
                break;
        }
       */

    }
}
