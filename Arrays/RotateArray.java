package Array;

import java.util.Scanner;

public class RotateArray {
    static int[] inputArray(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }

    static void printArray(int arr[]){
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }
    static void reverse(int arr[],int s,int e){
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;e--;
        }
    }
    static void rotate(int arr[],int k){
        int n=arr.length;
        if(n==1){
            return;
        }
        if(k>n){
            k=k%n;
        }
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }

    public static void main(String[] args) {
        int arr[]=inputArray();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter k: ");
        int k=s.nextInt();
        rotate(arr,k);
        printArray(arr);
    }
}
