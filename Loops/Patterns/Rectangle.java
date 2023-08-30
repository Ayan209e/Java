package Loops.Patterns;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        /* *****
           *****
           ***** */

        Scanner s=new Scanner(System.in);
        System.out.print("Enter No. Of Rows: ");
        int r=s.nextInt();
        System.out.print("Enter No. Of Columns: ");
        int c=s.nextInt();

        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
