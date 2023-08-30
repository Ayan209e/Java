package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class SearchInRotatedSortedArray {
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
    public static int findPosition(ArrayList<Integer> arr, int n, int k) {
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=arr.get(i);
        }
        int pivot=getPivot(array, n);
        if(k>=array[pivot] && k<=array[n-1]){
            return binarySearch(array, pivot, n-1, k);
        }
        else{
            return binarySearch(array, 0, pivot-1, k);
        }
    }


    public static void InputArray(int arr[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        InputArray(arr);
        System.out.print("Enter Target: ");
        int x = s.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(i,arr[i]);
        }
        System.out.println("Position: " + findPosition(list,n,x));
    }
}
