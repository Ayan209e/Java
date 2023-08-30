package BinarySearch;

import java.util.Scanner;

public class PeakInMountainArray {
    static void inputArray(int arr[]){
        int n= arr.length;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Lenght Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        inputArray(arr);
        int ans=peakIndexInMountainArray(arr);
        System.out.println("Pivot Element: " + ans);
    }
}
