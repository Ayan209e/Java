package BitManipulation;

import java.util.Scanner;

public class CheckPowerOfTwo {
     static boolean isPowerOfTwo(int n){
         return (n&(n-1))==0;
     }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=s.nextInt();
        if(isPowerOfTwo(n)){
            System.out.println("Power Of Two");
        }
        else{
            System.out.println("Not A Power Of Two");
        }
    }
}
