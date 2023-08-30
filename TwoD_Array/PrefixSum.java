package TwoD_Array;

import java.util.Scanner;

public class PrefixSum {
    static void input2DArray(int[][] arr,int r,int c){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Array Elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=s.nextInt();
            }
        }
    }
    static void print2DArray(int[][] arr,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    static void prefixSumMatrix(int arr[][],int r,int c){

        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                arr[i][j] += arr[i][j-1];
            }
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter No. Of Rows: ");
        int r = s.nextInt();
        System.out.print("Enter No. Of Columns: ");
        int c = s.nextInt();
        int arr[][] = new int[r][c];
        input2DArray(arr,r,c);
        prefixSumMatrix(arr,r,c);
        print2DArray(arr,r,c);
    }
}
