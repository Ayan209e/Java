package AssignmentsPWSkills;

import java.util.Scanner;

public class Operators {
    Scanner s = new Scanner(System.in);

//        Q1. Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
//              is taken with 5 and then multiply the resultant value by 5. Display the final result.
        /*
        System.out.print("Enter Number: ");
        int x= s.nextInt();
        int ans= (((x + 8) / 3) % 5) * 5;
        System.out.println("Answer: " + ans);
        */


//        Q2. - Swap two numbers without the use of third variable.
        /*
        System.out.print("Enter Value Of A: ");
        int a=s.nextInt();
        System.out.print("Enter Value Of B: ");
        int b=s.nextInt();

        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("Swapped A: "+a);
        System.out.println("Swapped B: "+b);
        */


//        Q3. Write a program to calculate the sum of the digits of a 3-digit number.
/*

        System.out.print("Enter Number: ");
        int n=s.nextInt();
        int digit,sum=0;
        while(n>0){
            digit=n%10;
            sum+=digit;
            n=n/10;
        }
        System.out.println("Sum Of Digits: "+ sum);
*/

//        Q4. Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if:
//                i) both the conditions 'a < 50' and 'a < b' are true.
//                ii) at least one of the conditions 'a < 50' or 'a < b' is true.
/*
        System.out.print("Enter Value Of A: ");
        int a=s.nextInt();
        System.out.print("Enter Value Of B: ");
        int b=s.nextInt();
        if(a<50 && a<b){
            System.out.println("First Part True");
        }
        else{
            System.out.println("First Part False");
        }

        if(a<50 || a<b){
            System.out.println("Second Part True");
        }
        else{
            System.out.println("Second Part False");
        }
    }
    */

//        Q5. Find the total number of bits needed to be flipped to convert x to y.
//        To Be Done !!!

}
