package NumberSystem;

import java.util.Scanner;

public class NegativeDecimalToBinary {

    static void negativeBinaryToDeciaml(int n){
        if (n == 0)
            return;
        negativeBinaryToDeciaml(n >>> 1);
        System.out.print(n & 1);
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Deciaml Number: ");
        int n=s.nextInt();
        negativeBinaryToDeciaml(n);
//        System.out.println("Binary Conversion: " + negativeBinaryToDeciaml(n));
    }
}
