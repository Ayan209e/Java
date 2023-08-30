package Loops.Patterns;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        /*
        *
        **
        ***
        ****
        *****
        */
        Scanner s=new Scanner(System.in);
        System.out.print("No. Of Rows: ");
        int n= s.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
