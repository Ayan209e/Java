package BitManipulation;

import java.util.Scanner;

public class UpdateIthBit {
    static int clearIthBit(int n,int i){
        int bitMask= ~(1<<i);
        return n & bitMask;
    }
    static int setIthBit(int n,int i){
        int bitMask= 1<<i;
        return n | bitMask;
    }
    static int updateIthBit(int n,int i,int newBit){
        if(newBit==0){
            return clearIthBit(n,i);
        }
        return setIthBit(n,i);
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=s.nextInt();
        System.out.print("Enter I: ");
        int i=s.nextInt();
        System.out.print("Enter New Bit To Be Set (0/1): ");
        int bit=s.nextInt();
        System.out.println("Number: " + updateIthBit(n,i,bit));
    }
}
