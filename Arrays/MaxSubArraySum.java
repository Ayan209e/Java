package Arrays;

import java.util.*;

public class MaxSubArraySum {
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

    static int maxSubArraySum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int n=arr.length;
        int pref[]=new int[n];
        pref[0]=arr[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++) {
                currSum= i==0 ? pref[j] : pref[j]-pref[i-1];

                if (maxSum<currSum) {
                    maxSum = currSum;
                }
            }
        }
       return maxSum;
    }

    public static void main(String[] args) {
        int arr[]=inputArray();
        System.out.println("Maximum SubArray Sum: " + maxSubArraySum(arr));
    }
}
