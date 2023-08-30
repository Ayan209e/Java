package BitManipulation;

import java.util.Scanner;

public class GetIthBit {
    static int getIthBit(int n,int i){ // suppose n=10 (1010) , i=3;
        int bitMask= 1<<i; // mask= 1 -> 10 -> 100;
        if((n&bitMask)==0){ // 1010 & 0100 = 0000
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=s.nextInt();
        System.out.print("Enter I: ");
        int i=s.nextInt();
        System.out.println("Ith Bit: " + getIthBit(n,i));
    }
}
