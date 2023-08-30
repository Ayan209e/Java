package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public static void inputArray(int arr[]){
        int n= arr.length;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
    }
    public static boolean isPossible(int stalls[],int k,int mid){
        int cowCount = 1;
        int lastPos = stalls[0];

        for(int i=0; i<stalls.length; i++ ){

            if(stalls[i]-lastPos >= mid){
                cowCount++;
                if(cowCount==k)
                {
                    return true;
                }
                lastPos = stalls[i];
            }
        }
        return false;
    }

    public static int aggressiveCows(int[] stalls, int k)
    {
        Arrays.sort(stalls);
        int s = 0;
        int n = stalls.length;
        int e=stalls[n-1];
        int ans = -1;
        int mid = s + (e-s)/2;

        while(s<=e) {
            if(isPossible(stalls, k, mid)) {
                ans = mid;
                s = mid + 1;
            }
            else
            {
                e = mid - 1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         System.out.print("Enter No Of Stalls: ");
        int n=s.nextInt();
         System.out.print("Enter Number Of Cows: ");
        int m=s.nextInt();
        int arr[]=new int[n];
        inputArray(arr);
        int ans=aggressiveCows(arr,m);
        System.out.println("Result: " + ans);

    }
}
