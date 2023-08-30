package NumberSystem;

import java.util.Scanner;

public class DecimalToBinary {

    static int decimalToBinary(int n){
        int ans=0;
        int pow=1;
        while(n>0){
            int rem=n%2;
            ans+=rem*pow;
            n/=2;
            pow*=10;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Deciaml Number: ");
        int n=s.nextInt();
        System.out.println("Binary Conversion: " + decimalToBinary(n));
    }
}
