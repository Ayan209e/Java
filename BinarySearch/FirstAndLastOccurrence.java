package BinarySearch;

import java.util.*;

public class FirstAndLastOccurrence {
    public static void InputArray(int arr[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
    }

    public static void PrintArray(int arr[]){
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }
    public static int first(int arr[], int n, int k){

        int s=0,e=n-1;
        int mid=(s+e)/2;
        int ans=-1;
        while(s<=e){
            if(arr[mid]==k){
                e=mid-1;
                ans=mid;
            }
            else if(arr[mid]>k){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid=(s+e)/2;
        }
        return ans;
    }
    public static int last(int arr[], int n, int k){

        int s=0,e=n-1;
        int mid=(s+e)/2;
        int ans=-1;
        while(s<=e){
            if(arr[mid]==k){
                s=mid+1;
                ans=mid;
            }
            else if(arr[mid]>k){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid=(s+e)/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        System.out.print("Enter Element To Find Last Occurrence: ");
        int x=s.nextInt();
        System.out.println("First Occurrence: " + first(arr,n,x));
        System.out.println("First Occurrence: " +  last(arr,n,x));


    }
}
