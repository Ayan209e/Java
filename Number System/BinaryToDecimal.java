package NumberSystem;

import java.util.Scanner;

public class BinaryToDecimal {

    static int binaryToDeciaml(int n){
        int ans=0;
        int pow=1;
        while(n>0){
            int rem=n%10;
            ans+=rem*pow;
            pow*=2;
            n/=10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Deciaml Number: ");
        int n=s.nextInt();
        System.out.println("Binary Conversion: " + binaryToDeciaml(n));
    }
}
