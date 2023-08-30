package AssignmentsPWSkills;

import java.util.Scanner;

public class TwoDArrayProblems {
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
    static void multiply(int[][] arr1,int r1,int c1,int[][] arr2,int r2,int c2){
        if(c1!=r2){
            System.out.println("Multiplication Not Possible-Wrong Dimensions");
            return;
        }
        int ans[][]=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    ans[i][j] += (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        System.out.println("Resultant Matrix:");
        print2DArray(ans,r1,c2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Q1 - Given two integer matrices, multiply the matrices, if possible, else return “Invalid Input”.
        /*
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
        */



//        Q2 - Given a square matrix, rotate it by 90 degrees in anti-clockwise direction.
/*
        System.out.print("Enter No. Of Rows Of Matrix: ");
        int r=s.nextInt();
        System.out.print("Enter No. Of Columns Of Matrix: ");
        int c=s.nextInt();
        int arr[][]=new int[r][c];
        input2DArray(arr,r,c);
//        n=r, m=c,x=i,y=j
        for(int i=0;i<r/2;i++){
            for(int j=0;j<r-i-1;j++){
                int temp=arr[i][j];
//                Move values from right to top
                arr[i][j]=arr[j][r-1-i];
//                Move values from bottom to right
                arr[j][r-1-i]=arr[r-1-i][r-1-j];
//                Move values from left to bottom
                arr[r-1-i][r-1-j]=arr[r-1-j][i];
//                Assign temp to left
                arr[r-1-j][i]=temp;
            }
        }
        print2DArray(arr,r,c);
        */


//        Q3 - Given a n*m matrix, return true if the matrix is a Toeplitz matrix. A matrix is called Toeplitz
//          if every diagonal from top-left to bottom-right has the same elements.
/*

        System.out.print("Enter No. Of Rows Of Matrix: ");
        int r=s.nextInt();
        System.out.print("Enter No. Of Columns Of Matrix: ");
        int c=s.nextInt();
        int arr[][]=new int[r][c];
        input2DArray(arr,r,c);
//        n=r, m=c,x=i,y=j
        for(int i=1;i<r;i++) {
            for (int j = 1; j < c; j++) {
                if(arr[i][j]!=arr[i-1][j-1]){
                    System.out.println("Not a Toeplitz matrix");
                    return;
                }
            }
        }
        System.out.println("Toeplitz Matrix");
*/


//        Q4 - Given a n*m matrix, return an array of elements containing diagonal traversal of the matrix.
/*

        System.out.print("Enter No. Of Rows Of Matrix: ");
        int r=s.nextInt();
        System.out.print("Enter No. Of Columns Of Matrix: ");
        int c=s.nextInt();
        int arr[][]=new int[r][c];
        input2DArray(arr,r,c);
        int ans[]=new int[r*c];
        int idx=0,row=0,col=0;
        while(col<c){
            int i=row,j=col;
            while(i>=0 && j<c){
                ans[idx]=arr[i][j];
                idx++;i--;j++;
            }
            row++;
            if(row>=r){
                row=r-1;
                col++;
            }
        }
        for(int ele:ans){
            System.out.print(ele + " ");
        }
*/


//        Q5 - Given an array of intervals where intervals[i] = [start, end], merge all overlapping intervals,
//          and return the count of the non-overlapping intervals that cover all the intervals in the input.

//        To Be Done




    }
}
