package Array;

import java.util.Scanner;

public class BookAllocation {
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

    static boolean isPossible(int arr[],int n,int m,int mid){
        int studentCount=1;
        int pageSum=0;
        for(int i=0;i<n;i++){
            if(pageSum + arr[i] <=mid){
                pageSum+=arr[i];
            }
            else{
                studentCount++;
                if(studentCount>m || arr[i]>mid){
                    return false;
                }
                pageSum=arr[i];
            }
        }
        return true;
    }
    static int allocateBooks(int arr[],int n,int m){
        int sum=0;
        for(int ele:arr){
            sum+=ele;
        }
        int ans=0;
        int s=0,e=sum;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isPossible(arr,n,m,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int arr[]=inputArray();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter No. Of Students: ");
        int m=s.nextInt();
        System.out.println("Result: " + allocateBooks(arr,arr.length,m));
    }
}
