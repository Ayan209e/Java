package Array;

import java.util.Scanner;

public class FirstNLastOccurrence {
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

    static int firstOccurrence(int arr[],int x){
        int n=arr.length;
        int s=0,e=n-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==x){
                ans=mid;
                e=mid-1;
            }
            else if(arr[mid]<x){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }

    static int lastOccurrence(int arr[],int x){
        int n=arr.length;
        int s=0,e=n-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==x){
                ans=mid;
                s=mid+1;
            }
            else if(arr[mid]<x){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]=inputArray();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Element To Find: ");
        int x=s.nextInt();
        System.out.println("First Occurrence: " + firstOccurrence(arr,x) );
        System.out.println("First Occurrence: " + lastOccurrence(arr,x) );
    }
}
