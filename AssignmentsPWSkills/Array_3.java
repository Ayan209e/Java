package AssignmentsPWSkills;

import java.util.Arrays;
import java.util.Scanner;

public class Array_3 {
    public static void InputArray(int arr[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
    }

    public static void PrintArray(int arr[]){
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }
    static void sortSquares(int arr[]){
        int i=0,j=arr.length-1;
        while(i<=j){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                arr[i]=arr[i]+arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
                j--;
            }
            else{
                i++;
            }
        }
        for(int k=0;k< arr.length;k++){
            arr[k]=arr[k]*arr[k];
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Q1. Given an integer m, n, and n integers, return true if the number of unique integers among the n integers is
//          greater than or equal to m, else return false.(Integers appearing multiple times are all considered as 1 unique
//          integer).
/*

        System.out.print("Enter M: ");
        int m=s.nextInt();
        System.out.print("Enter N: ");
        int n=s.nextInt();

        int arr[]=new int[n];
        InputArray(arr);
        int i=0,cnt=0;
        Arrays.sort(arr);
        while(i<n){
            cnt++;
            while(i<n-1 && arr[i+1]==arr[i]){
                i++;
            }
            i++;
        }
        if(cnt>=m){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
*/


//      Q2. Given an integer array arr, return the number of consecutive sequences(subarrays) with odd sum.
//        To Be Done


//        Q3. You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints
//          of the ith line are (i, 0) and (i, height[i]). Find two lines that together with the x-axis form a container,
//          such that the container contains the most water. Return the maximum amount of water a container can store.
//        To Be Done



//        Q4. Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two
//          numbers such that they add up to a specific target number. Return the indices of the two numbers added
//          by one. Return -1 if pair does not exist.
        /*
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        System.out.print("Enter Target Sum: ");
        int x=s.nextInt();
        System.out.println("Valid Pairs: ");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i] + " , " + arr[j]);
                }
            }
        }
    */


//        Q5.Given an array sorted in increasing order, return an array of squares of each number sorted in increasing order
/*
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        sortSquares(arr);
        PrintArray(arr);

        */
    }
}

