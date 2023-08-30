package Array;

import java.util.*;

public class AggressiveCows {
    static int[] inputArray(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    static boolean isPossible(int stalls[],int n,int k,int mid){
        int cows=1;
        int lastPos=stalls[0];
        for(int i=0;i<n;i++){
            if(stalls[i]-lastPos>=mid){
                cows++;
                if(cows==k){
                    return true;
                }
                lastPos=stalls[i];
            }
        }
        return false;
    }

    public static int aggressiveCows(int []stalls, int k) {
        Arrays.sort(stalls);
        int s=0;
        int n=stalls.length;
        int e=stalls[n-1];
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isPossible(stalls, n, k, mid)){
                ans=mid;
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
        System.out.print("Enter No. Of Cows: ");
        int k=s.nextInt();
        System.out.println("Result: " + aggressiveCows(arr,k));
    }
}
