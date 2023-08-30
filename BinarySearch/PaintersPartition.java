package BinarySearch;

import java.util.*;

public class PaintersPartition {
    static void inputArray(int arr[]){
        int n= arr.length;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
    }
    public static boolean isPossible(int arr[],int n,int k,int mid){
        int painter=1;
        int area=0;
        for(int i=0;i<n;i++){
            if(area+arr[i]<=mid){
                area+=arr[i];
            }
            else{
                painter++;
                if(painter>k || arr[i]>mid){
                    return false;
                }
                area=arr[i];
            }
            if(painter>k){
                return false;
            }
        }
        return true;
    }

    public static int paintersPartition(int[] arr, int k)
    {
        int n= arr.length;
        int s=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int e=sum;
        int mid=s+ (e-s)/2;
        int ans=-1;
        while(s<=e){
            if(isPossible(arr,n,k,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid=s+ (e-s)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter No Of Boards: ");
        int n=s.nextInt();
        System.out.print("Enter Number Of Painters: ");
        int m=s.nextInt();
        int arr[]=new int[n];
        inputArray(arr);
        int ans=paintersPartition(arr,m);
        System.out.println("Result: "+ ans);

    }
}
