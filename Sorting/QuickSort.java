package Sorting;

import java.util.Scanner;

public class QuickSort {

    static void sort(int arr[],int low,int hi){
        if(low>=hi) {
            return;
        }
        int s=low;
        int e=hi;
        int m=s + (e-s)/2;
        int pivot=arr[m];

        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;e--;
            }
        }
        sort(arr,low,e);
        sort(arr,s,hi);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter Array Elements: ");
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        sort(arr,0,n-1);
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
