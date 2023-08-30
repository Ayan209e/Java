package BitManipulation;

import java.util.Scanner;

public class FastExponentiation {
    static int fastExpo(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1) !=0){
                ans*=a;
            }
            a*=a;
            n=n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a=s.nextInt();
        System.out.print("Enter Power: ");
        int n=s.nextInt();
        System.out.println("Power: " + fastExpo(a,n));
    }

}
