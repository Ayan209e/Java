package AssignmentsPWSkills;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
/*
//        Q1. Write a program to print Fibonacci series of n terms where n is input by user.
        System.out.print("Enter Number Of Terms: ");
        int n=s.nextInt();
        System.out.print("1 1 ");
        int next,prev=1,curr=1;
        for(int i=1;i<=n-2;i++){
            next=prev+curr;
            prev=curr;
            curr=next;
            System.out.print(next + " ");
        }
    */

//        Q2. Write a program to enter the numbers till the user wants, the number can be positive, negative or zero.
//            Calculate the sum of numbers until a negative number is encountered. If the input is a negative number,
//            current sum is discarded and print -1.
/*

        System.out.print("Enter Numbers: ");
        int sum=0;
        while(s.hasNextInt()){
            int n=s.nextInt();
            if(n>0){
                sum+=n;
            }
            else {
                sum = -1;
                break;
            }
        }
        System.out.println("Sum: " + sum);
*/


//        Q3. Write a program to calculate the factorial of a number.
/*

        System.out.print("Enter Number: ");
        int n=s.nextInt();
        int fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial: " + fact);
*/


//        Q4. Write a program to print all Armstrong numbers between 1 to n.

//        To Be Done



//        Q5. Write a program to print the cross pattern given below (in the shape of X):
//              *   *
//               * *
//                *
//               * *
//              *   *
/*

        System.out.print("Enter No. Of Rows: ");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==j) || (i+j== n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
*/


//        Q6. Write a program to print alphabet diamond pattern:
//                  A
//                 ABC
//                ABCDE
//               ABCDEFG
//              ABCDEFGHI
//               ABCDEFG
//                ABCDE
//                 ABC
//                  A
        /*
        System.out.println("Enter No. Of Rows: ");
        int n=s.nextInt();
        int alpha=65,num=0;
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print((char)(alpha+(num++)));
            }
            num=0;
            System.out.println();
        }

        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=((n-i)*2)-1;j>0;j--){
                System.out.print((char)(alpha+(num++)));
            }
            num=0;
            System.out.println();
        }
*/


//        Q7. Write a program to print pattern given below :
//                    *
//                    *
//                  ******
//                    *
//                    *
/*

        System.out.print("Enter No. Of Rows: ");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i== n/2){
                    System.out.print("*");
                }
                else{
                    if(j==n/2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
*/

//        Q8. Write a program to print a triangle of prime numbers upto given number of lines of the trinagle.

//        To Be Done


//        Q9. Write a program to check whether a prime Number can be expressed as a Sum of Two Prime Numbers.

//        To Be Done



//        Q10. You are given n number of bulbs. They are all switched off. A weird fluctuation in voltage hits the circuit n times.
//          In the 1st fluctuation all bulbs are toggled, in the 2nd fluctuation every 2nd bulb is toggled, in the 3rd fluctuation every
//          3rd bulb is toggled and so on. You've to find which bulbs will be switched on after n fluctuations.
//          Take as input a number n, representing the number of bulbs.
//          Print all the bulbs that will be on after the nth fluctuation in voltage.
/*

        System.out.print("Enter Value Of N: ");
        int n=s.nextInt();
        for(int i=1;i*i<=n;i++){
            System.out.print(i*i + " ");
        }
*/



    }
}
