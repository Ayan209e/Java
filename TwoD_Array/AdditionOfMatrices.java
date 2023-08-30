package TwoD_Array;

import java.util.Scanner;


public class AdditionOfMatrices {

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


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter No. Of Rows Of Matrix: ");
        int r=s.nextInt();
        System.out.print("Enter No. Of Columns Of Matrix: ");
        int c=s.nextInt();
        int arr1[][]=new int[r][c];
        int arr2[][]=new int[r][c];
        input2DArray(arr1,r,c);
        input2DArray(arr2,r,c);
        int ans[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]= arr1[i][j] + arr2[i][j];
            }
        }
        print2DArray(ans,r,c);


    }
}
