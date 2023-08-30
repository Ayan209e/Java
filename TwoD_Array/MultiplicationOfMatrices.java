package TwoD_Array;

import java.util.Scanner;

public class MultiplicationOfMatrices {
    static void input2DArray(int[][] arr,int r,int c){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Matrix Elements:");
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
    static void multiply(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if(c1 != r2){
            System.out.println("Multiplication Not Possible - Wrong Dimension");
            return;
        }
        int ans[][]=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    ans[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("Resultant Matrix: ");
        print2DArray(ans,r1,c2);
    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter No. Of Rows Of Matrix 1: ");
        int r1=s.nextInt();
        System.out.print("Enter No. Of Columns Of Matrix 1: ");
        int c1=s.nextInt();
        System.out.println("Make sure that No .of rows of matrix 2 must be equal to the no. of columns of matrix 1");
        System.out.print("Enter No. Of Rows Of Matrix 2: ");
        int r2=s.nextInt();
        System.out.print("Enter No. Of Columns Of Matrix 2: ");
        int c2=s.nextInt();
        int arr1[][]=new int[r1][c1];
        int arr2[][]=new int[r2][c2];
        input2DArray(arr1,r1,c1);
        input2DArray(arr2,r2,c2);
        multiply(arr1,r1,c1,arr2,r2,c2);






    }
}

