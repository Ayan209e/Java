package Loops.Patterns;

import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        /*
         1
         12
         123
         1234
         12345
         */
        Scanner s=new Scanner(System.in);
        System.out.print("No. Of Rows: ");
        int n= s.nextInt();

        for(int i=1;i<=n;i++){
            int k=1;
            for(int j=1;j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
