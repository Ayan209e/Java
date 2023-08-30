package Loops.Patterns;

import java.util.Scanner;

public class AlternateNumberRectangle {
    public static void main(String[] args) {
        /*
         1212
         2121
         1212
         2121
         */
        Scanner s=new Scanner(System.in);
        System.out.print("No. Of Rows: ");
        int n= s.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("2");
                }
            }
            System.out.println();
        }
    }
}
