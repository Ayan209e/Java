package Recursion;

import java.util.Scanner;

public class CheckRotatedArray {

    static void checkRotated(int arr[],int n){
        if(n==1){
            System.out.println("Rotated Array");
            return;
        }
        int ans=helper(arr,n,0);
        if(ans>0){
            System.out.println("Rotated Array at " + ans + " Index");
        }
        else{
            System.out.println("Not Rotated Array");
        }
    }

    static int helper(int arr[],int n,int i){
        if(i==n-1){
            return 0;
        }
        if(arr[i]>arr[i+1]){
            return i;
        }

        return helper(arr,n,i+1);
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
        checkRotated(arr,n);
    }
}
