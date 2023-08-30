package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchInRotatedSorted {
    static int[] inputArray(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static int getPivot(int arr[],int n){
        int s=0,e=n-1;
        int mid=(s+e)/2;
        while(s<e){
            if(arr[mid]>=arr[0]){
                s=mid+1;
            }
            else{
                e=mid;
            }
            mid=(s+e)/2;
        }
        return s;
    }

    public static int binarySearch(int arr[],int s,int e,int k){
        int start=0,end=e;
        int mid=(s+e)/2;
        while(start<=end){
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]>k){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            mid=(s+e)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=inputArray();
        System.out.print("Enter Element To Search: ");
        int k=s.nextInt();
        int n=arr.length;
        int pivot=getPivot(arr, n);
        if(k>=arr[pivot] && k<=arr[n-1]){
            System.out.println("Position: " + binarySearch(arr, pivot, n-1, k));
        }
        else{
            System.out.println("Position: " + binarySearch(arr, 0, pivot-1, k));
        }
    }
}
