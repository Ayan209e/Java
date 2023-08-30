package Arrays;

import java.util.Scanner;

// This algorithm is used to find the maximum sub array sum.
// Time complexity: O(n)
// In this if the currSum becomes negative then we just make it 0, we don't use negative values.
// If all the elements or array are negative then return the max number;

public class KadanesAlgorithm {
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

    static int kadanes(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[]=inputArray();
        System.out.println("Maximum SubArray Sum: " + kadanes(arr));
    }
}
