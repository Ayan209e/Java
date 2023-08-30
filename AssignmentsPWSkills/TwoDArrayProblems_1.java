package AssignmentsPWSkills;

import java.util.Scanner;

public class TwoDArrayProblems_1 {

    public static void input2DArray(int[][] arr){
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=s.nextInt();
            }
        }
    }
    public static void print2DArray(int[][] arr){
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void prefixSum(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                arr[i][j] += arr[i][j-1];
            }
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter No. Of Row:");
        int r=s.nextInt();
        System.out.print("Enter No. Of Column:");
        int c=s.nextInt();
        int arr[][]=new int[r][c];
        input2DArray(arr);


//        Q1 - Given a matrix arr[][] of integers, print the prefix sum matrix for it.
/*
        prefixSum(arr);
        print2DArray(arr);
        */


//      Q2. A square matrix is said to be an perfect Matrix if both of the following conditions hold:
//          a) All the elements in the diagonals of the matrix are non-zero integers.
//          b) All other elements except the diagonal elements are 0.
//          Given a 2D integer array grid of size n*n representing a square matrix, return true if grid is a
//          perfect matrix. Otherwise, return false.
/*

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j || i+j==r-1){
                    if(arr[i][j]==0){
                        System.out.println("Not A Perfect Matrix");
                        return;
                    }
                }
                else{
                    if(arr[i][j]!=0){
                        System.out.println("Not A Perfect Matrix");
                        return;
                    }
                }
            }
        }
        System.out.println("Perfect Matrix");
*/


//        Q3. Write a user defined function upper() which takes an integer square matrix as an input and its size N
//        and prints the upper half of the matrix.

        for(int i=0;i<r;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<c;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
