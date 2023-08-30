package TwoD_Array;

import java.util.Scanner;

public class DiagonalSum {

    static int diagonalSum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];

            if(i !=arr.length-i-1){
                sum+=arr[i][arr.length-i-1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter No. of Rows: ");
        int r=s.nextInt();
        System.out.print("Enter No. of Columns: ");
        int c=s.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=s.nextInt();
            }
        }

        System.out.println("Diagnoal Sum: " +diagonalSum(arr));
    }
}
