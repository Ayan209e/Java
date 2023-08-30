package Loops.Patterns;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        /*
         ********
         *      *
         *      *
         *      *
         *      *
         ********
         */

        Scanner s=new Scanner(System.in);
        System.out.print("Enter No. Of Rows: ");
        int r=s.nextInt();
        System.out.print("Enter No. Of Columns: ");
        int c=s.nextInt();

        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || i==r || j==1 || j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
