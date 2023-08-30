package BitManipulation;

import java.util.Scanner;

public class EvenOdd {

    static void oddEven(int n){
        if((n&1)==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=s.nextInt();
        oddEven(n);
    }
}
