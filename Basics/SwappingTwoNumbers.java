package Basics;

import java.util.Scanner;

public class SwappingTwoNumbers {


    static void swapUsingVar(int a,int b){         //Swapping Using Temporary Variable
        System.out.println("Values Before Swapping: ");
        System.out.println("A: " + a + "    ,     B: " + b);
        int c=a;
        a=b;
        b=c;
        System.out.println("Values After Swapping: ");
        System.out.println("A: " + a + "    ,     B: " + b);
    }

    static void swap(int a,int b){          //Swapping Using Sum And Difference  **Better**
        System.out.println("Values Before Swapping: ");
        System.out.println("A: " + a + "    ,     B: " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Values After Swapping: ");
        System.out.println("A: " + a + "    ,     B: " + b);
    }


    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Value Of A: ");
        int a=s.nextInt();
        System.out.print("Enter Value Of B: ");
        int b=s.nextInt();
//        swapUsingVar(a,b);
        swap(a,b);
    }
}
