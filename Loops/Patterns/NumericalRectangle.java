package Loops.Patterns;

import java.util.Scanner;

public class NumericalRectangle {
    public static void main(String[] args) {
        /*
         12345
         23451
         34512
         45123
         51234
         */
        Scanner s=new Scanner(System.in);
        System.out.print("No. Of Rows: ");
        int n= s.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            for(int j=1;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
