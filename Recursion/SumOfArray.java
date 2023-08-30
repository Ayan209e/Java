package Recursion;

import java.util.Scanner;

public class SumOfArray {
    public static int sumOfArray(int arr[],int i){
        if(i==arr.length-1){
            return arr[i];
        }
        return arr[i]+sumOfArray(arr,i+1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int ans=sumOfArray(arr,0);
        System.out.println("Sum Of Array: " + ans);
    }
}
