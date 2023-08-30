package NumberSystem;

import java.util.Scanner;

public class ReverseInteger {

    static int reverse(int n){
        int ans=0;
        while(n!=0){
            int rem=n%10;
            if(ans>Integer.MAX_VALUE/10 ||ans<Integer.MIN_VALUE/10){
                return 0;
            }
            ans=ans*10+rem;
            n/=10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Deciaml Number: ");
        int n=s.nextInt();
        System.out.println("Reverse : " + reverse(n));
    }
}
