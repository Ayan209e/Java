package Arrays;

import java.util.Scanner;

public class EqualPartitionSum {
    public static void InputArray(int arr[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
    }
    static int arraySum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    static boolean equalPartitionAvailable(int arr[]){
        int n= arr.length;
        int totalSum=arraySum(arr);
        int prefSum=0;
        for(int i=0;i<n;i++){
            prefSum+=arr[i];
            int suffixSum=totalSum-prefSum;
            if(prefSum==suffixSum){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        boolean available=equalPartitionAvailable(arr);
        if(available){
            System.out.println("Partiton Available");
        }
        else{
            System.out.println("Partition Not Available");
        }

    }
}
