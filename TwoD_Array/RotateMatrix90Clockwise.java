package TwoD_Array;

import java.util.Scanner;

public class RotateMatrix90Clockwise {
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

    static void transpose(int[][] arr,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    static void reverserow(int[][] arr,int r){
        for(int i=0;i<r;i++){
            int j=0,k=r-1;
            while(j<=k){
                int temp=arr[i][j];
                arr[i][j]=arr[i][k];
                arr[i][k]=temp;
                j++;k--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Rows Or Columns Of Square Matrix: ");
        int r=s.nextInt();

        int arr[][]=new int[r][r];
        input2DArray(arr,r,r);

//        To rotate matrix: we will take transpose and reverse each row...

        transpose(arr,r,r);
        reverserow(arr,r);
        print2DArray(arr,r,r);

    }
}
