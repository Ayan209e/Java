package Arrays;

import java.util.Scanner;

public class PrefixSum {
    public static void InputArray(int arr[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
    }

    public static void PrintArray(int arr[]){
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }


    static int[] prefixSum(int arr[]){
        int sum=0;
        int n= arr.length;
        int pref[]=new int[n];
        for(int i=0;i<n;i++){
            sum+=arr[i];
            pref[i]=sum;
        }
        return pref;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        int pref[]=prefixSum(arr);
        PrintArray(pref);
    }

}
