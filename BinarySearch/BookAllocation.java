package BinarySearch;

import java.util.Scanner;

public class BookAllocation {

    static void inputArray(int arr[]){
        int n= arr.length;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
    }

    public static long allocateBooks( int[] time,int n, int m) {
        // Write your code here.
        long start = 0, totalTime = 0, ans = -1;
        for(int i: time){
            totalTime += i;
        }
        long end = totalTime;
        while(start <= end){
            long mid = (start + end) / 2;
            if(isPossible(n,m,time,mid)){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
    private static boolean isPossible(long n, long m, int[] arr, long mid){
        int day = 1;
        long requireTime = 0;
        for(int x : arr){
            if(requireTime + x <= mid){
                requireTime += x;
            }else{
                ++day;
                if(day > n || x > mid){
                    return false;
                }
                requireTime = x;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter No. Of Books: ");
        int n=s.nextInt();
        System.out.print("Enter Number Of Students: ");
        int m=s.nextInt();
        int arr[]=new int[n];
        inputArray(arr);
        long ans=allocateBooks(arr,n,m);
        System.out.println("Result: "+ ans);

    }
}
