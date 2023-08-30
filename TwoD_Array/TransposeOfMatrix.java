package TwoD_Array;

import java.util.Scanner;

public class TransposeOfMatrix {
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

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Rows And Columns: ");
        int r=s.nextInt();
        int c=s.nextInt();

        int arr[][]=new int[r][c];
        input2DArray(arr,r,c);
        transpose(arr,r,c);
        print2DArray(arr,r,c);

    }
}
