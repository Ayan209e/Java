package Loops.Patterns;

import java.util.Scanner;

//*   *   *   *   *
//*   *       *   *
//*               *
//*   *       *   *
//*   *   *   *   *
public class HollowDiamond {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int N=s.nextInt();
        int n=(N/2)+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*    ");
            }
            for (int j=2;j<i;j++){
                System.out.println("    ");
            }
            for (int j=2;j<i;j++){
                System.out.println("    ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*    ");
            }
            System.out.println();
        }
    }
}
