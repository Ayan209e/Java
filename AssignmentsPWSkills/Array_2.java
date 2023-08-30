package AssignmentsPWSkills;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2 {
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
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


//        Q1. Given an unsorted array arr[] of size N having both negative and positive integers, place
//          all negative elements at the end of array without changing the order of positive elements
//          and negative elements.
        /*
        System.out.print("Enter Length: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        int ans[]=new int[n];

        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                ans[j++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                ans[j++]=arr[i];
            }
        }
        PrintArray(ans);
*/


//        Q2. Given two arrays a[] and b[] of size n and m respectively where m >= n. The task is to find union
//          between these two arrays and print the number of elements of the union set.
//          Union of the two arrays can be defined as the set containing distinct elements from both the arrays.
//          If there are repetitions, then only one occurrence of element should be printed in the union.
/*

        System.out.print("Enter Length Of A: ");
        int n = s.nextInt();
        System.out.print("Enter Length Of B: ");
        int m = s.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " ");
            else if (arr2[j] < arr1[i])
                System.out.print(arr2[j++] + " ");
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }

        */
/* Print remaining elements of
         the larger array *//*

        while (i < m)
            System.out.print(arr1[i++] + " ");
        while (j < n)
            System.out.print(arr2[j++] + " ");

*/

//        Q3. Given an array arr[] and an integer K where K is smaller than size of array, the task is to
//          find the Kth smallest element in the given array. It is given that all array elements are distinct.
/*

        System.out.println("Enter the length of array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        Arrays.sort(arr);
        System.out.print(arr[k-1]);
    }
*/

//        Q4.Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array
//        which adds to a given number S. In case of multiple subarrays, return the subarray which comes first on moving
//        from left to right. You need to print the start and end index of answer subarray.
/*
        System.out.print("Enter Length: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        InputArray(arr);
        System.out.print("Enter Target Sum: ");
        int x = s.nextInt();
        int i = 0, j = 0, sum = 0;
        while (j < n) {
            sum += arr[j];
            if (sum > x) {
                while (sum > x && i < j) {
                    sum -= arr[i];
                    i++;
                }
            }
            if (sum == x) {
                System.out.println(i + " " + j);
                break;
            }
            j++;
        }
        */


//        Q5. Write a Java program to test the equality of two arrays.

        System.out.print("Enter Length Of Array-1: ");
        int n = s.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter Elements Of Array 1: ");
        InputArray(arr1);
        System.out.print("Enter Length Of Array-2: ");
        int m = s.nextInt();
        int arr2[] = new int[m];
        System.out.println("Enter Elements Of Array 2: ");
        InputArray(arr2);
        if(n != m){
            System.out.println("Arrays Not Equal");
            return;
        }
        else{
            for(int i=0;i<n;i++){
                if(arr1[i] != arr2[i]){
                    System.out.println("Arrays Not Equal");
                    return;
                }
            }
            System.out.println("Arrays Equal");
        }




    }
}
