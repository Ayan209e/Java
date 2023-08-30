package Recursion;

import java.util.Scanner;

public class CheckSortedArray {

    static void checkSorted(int arr[],int n){
        if(n==1){
            System.out.println("Sorted Array");
        }
        boolean ans=helper(arr,n,0);
        if(ans){
            System.out.println("Sorted Array");
        }
        else{
            System.out.println("Array Not Sorted");
        }
    }

    static boolean helper(int arr[],int n,int i){
        if(n==1)return true;
        if(i==n-1) return true;
        return (arr[i]<arr[i+1]) && helper(arr,n,i+1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        checkSorted(arr,n);
    }
}
