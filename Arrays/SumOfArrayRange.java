package Arrays;

import java.util.Scanner;

public class SumOfArrayRange {
    static int[] prefixSum(int arr[]){
        int sum=0;
        int n= arr.length;
        int pref[]=new int[n];
        for(int i=1;i<n;i++){
            sum+=arr[i];
            pref[i]=sum;
        }
        return pref;
    }

    static int sumArrayRange(int arr[],int s,int e){
        int ans=prefixSum(arr)[e] - prefixSum(arr)[s-1];
        return ans;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n+1];
        System.out.println("Enter Elements: ");
        for(int i=1;i<arr.length;i++){
            arr[i]=s.nextInt();
        }

        System.out.print("Enter No. Of Queries: ");
        int q=s.nextInt();
        for(int i=0;i<q;i++){
            System.out.print("Enter Left Index: ");
            int l=s.nextInt();
            System.out.print("Enter Right Index: ");
            int r=s.nextInt();
            int ans=sumArrayRange(arr,l,r);
            System.out.println("Sum Of The Range: " + ans);
            System.out.println();
        }
    }
}
