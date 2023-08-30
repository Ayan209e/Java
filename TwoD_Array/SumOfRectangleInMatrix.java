package TwoD_Array;

import java.util.Scanner;

public class SumOfRectangleInMatrix {
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
    static void prefixSumMatrix(int arr[][]) {
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++) {//Row wise sum
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }
        for (int j = 0; j < c; j++) {//Column Wise Sum
            for (int i = 1; i < r; i++) {
                arr[i][j] += arr[i - 1][j];
            }
        }
    }
    static int rectangleSum(int[][] arr,int l1,int r1,int l2,int r2){
        int ans=0,sum=0,up=0,left=0,leftUp=0;
        prefixSumMatrix(arr);
        sum=arr[l2][r2];
        if(l1>=1) {
            up = arr[l1 - 1][r2];
        }
        if(r1>=1){
            left=arr[l2][r1-1];
        }
        if(l1>-1 && r1>=1){
            leftUp=arr[l1-1][r1-1];
        }
        ans = sum - up -left + leftUp;
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter No. Of Rows: ");
        int r = s.nextInt();
        System.out.print("Enter No. Of Columns: ");
        int c = s.nextInt();
        int arr[][] = new int[r][c];
        input2DArray(arr,r,c);
        System.out.print("Enter Value Of L1: ");
        int r1 = s.nextInt();
        System.out.print("Enter Value Of R1: ");
        int l1= s.nextInt();
        System.out.print("Enter Value Of L2: ");
        int r2= s.nextInt();
        System.out.print("Enter Value Of R2: ");
        int l2= s.nextInt();
        int ans=rectangleSum(arr,l1,r1,l2,r2);
        System.out.println("Sum: "+ ans);
    }
}
