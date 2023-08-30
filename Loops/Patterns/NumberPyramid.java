package Loops.Patterns;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        /*
            1
           121
          12321
         1234321
         */
        Scanner s=new Scanner(System.in);
        System.out.print("No. Of Rows: ");
        int n= s.nextInt();

        for(int i=1;i<=n;i++){
            int k=1;
            for(int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(k);
                k++;
            }

            for(int j=1;j<i;j++){
                System.out.print(i-j);
            }
            System.out.println();
        }

    }
}
