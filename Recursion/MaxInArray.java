package Recursion;

import java.util.Scanner;

public class MaxInArray {

    public static int max(int arr[],int i) {
        if(i==arr.length-1){
            return arr[i];
        }
        int smallAns=max(arr,i+1);

        return Math.max(arr[i],smallAns);


    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int ans=max(arr,0);
        System.out.println("Max. In Array: "+ ans);
    }
}

