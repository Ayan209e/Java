package Recursion;

import java.util.Scanner;

public class MergeSort {

    static void merge(int arr[],int s,int mid,int e){
        int n1=mid-s+1;
        int n2=e-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[s+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=s;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
    }

    static void mergeSort(int arr[],int s,int e){
        if(s>=e)return;
        int mid=(s+e)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        merge(arr,s,mid,e);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        mergeSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
