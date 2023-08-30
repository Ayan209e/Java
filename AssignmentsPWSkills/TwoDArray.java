package AssignmentsPWSkills;

import java.util.Scanner;

public class TwoDArray {
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
    static boolean searchInMatrix(int[][] arr,int x){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==x){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Q1. Check if an element x exists in the given matrix or not. If it does not exist, return -1, else return its
//             row and column index.
/*
        System.out.print("Enter No. Of Rows: ");
        int r = s.nextInt();
        System.out.print("Enter No. Of Columns: ");
        int c = s.nextInt();
        int arr[][] = new int[r][c];
        input2DArray(arr,r,c);
        System.out.print("Enter Element To Search: ");
        int x=s.nextInt();
        boolean ans=searchInMatrix(arr,x);
        if(ans){
            System.out.println("Element Present");
        }
        else{
            System.out.println("Element Absent");
        }
        */


//        Q2. Convert a 1D sorted array of length n*m to a 2D array of n rows and m columns. The matrix
//          should also be sorted.
/*
        System.out.print("Enter n: ");
        int r = s.nextInt();
        System.out.print("Enter m: ");
        int c = s.nextInt();
        int arr[]=new int[r*c];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<r*c;i++){
            arr[i]=s.nextInt();
        }
        int k=0;
        int ans[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=arr[k];
                k++;
            }
        }
        print2DArray(ans,r,c);
        */


//        Q3. Given a 2D array of n rows and m columns, return the sum of elements along the range of row
//          and column specified.
/*

        System.out.println("Enter the dimensions of the 2d array: ");
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] mat = new int[n][m];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the range of rows: ");
        int srow = s.nextInt();
        int erow = s.nextInt();
        System.out.println("Enter the range of columns: ");
        int scol = s.nextInt();
        int ecol = s.nextInt();
        int sum = 0;
        while(srow<=erow){
            int j=scol;
            while(j<=ecol){
                sum+=mat[srow][j];
                j++;
            }
            srow++;
        }
        System.out.println("Sum: "+ sum);;
*/


//        Q4. Given a 2D array for n rows and m columns, reverse each row.
/*

        System.out.print("Enter No. Of Rows: ");
        int r = s.nextInt();
        System.out.print("Enter No. Of Columns: ");
        int c = s.nextInt();
        int arr[][] = new int[r][c];
        input2DArray(arr,r,c);
        for(int i=0;i<r;i++){
            int j=0,k=c-1;
            while(j<=k){
                int temp=arr[i][j];
                arr[i][j]=arr[i][k];
                arr[i][k]=temp;
                j++;k--;
            }
        }
        print2DArray(arr,r,c);
*/


//        Q5. Check if an element x exists in the given sorted matrix or not. Each row and column
//        is sorted in itself. If it does not exist, return -1, else return its row and column index.

        System.out.println("Enter the dimensions of the array: ");
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the element to be searched: ");
        int x = s.nextInt();
        int i = 0, j = m - 1;
        while (i < n && j >= 0) {
            if (arr[i][j] == x) {
                System.out.println("Row = " + i);
                System.out.println("Column = " + j);
                return;
            }
            if (arr[i][j] > x)
                j--;
            else
                i++;
        }
        System.out.print(-1);
    }
}
    

