package BitManipulation;

import java.util.Scanner;

public class ClearRangeOfBits {
    static int clearRangeOfBits(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n&bitMask;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=s.nextInt();
        System.out.print("Enter Starting Index: ");
        int i=s.nextInt();
        System.out.print("Enter Ending Index: ");
        int j=s.nextInt();
        System.out.println("Number: " + clearRangeOfBits(n,i,j));
    }
}
