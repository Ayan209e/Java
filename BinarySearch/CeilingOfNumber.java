package BinarySearch;

import java.util.Scanner;

public class CeilingOfNumber {
    static void inputArray(int arr[]){
        int n= arr.length;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
    }

    static int ceiling(int arr[],int n,int k){
        int ans=0;
        int s=0,e=n-1;
        int mid=s+(e-s)/2;
        while(s<=e){
            if(arr[mid]>=k){
                ans=arr[mid];
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n=s.nextInt();
        System.out.print("Enter Number To Find Ceiling: ");
        int x=s.nextInt();
        int arr[]=new int[n];
        inputArray(arr);
        int ans=ceiling(arr,n,x);
        System.out.println("Result: "+ ans);

    }
}
