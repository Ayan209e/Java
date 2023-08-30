package BitManipulation;

import java.util.Scanner;

public class SetIthBit {
    static int setIthBit(int n,int i){
        int bitMask= 1<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=s.nextInt();
        System.out.print("Enter I: ");
        int i=s.nextInt();
        System.out.println("Number: " + setIthBit(n,i));
    }
}
