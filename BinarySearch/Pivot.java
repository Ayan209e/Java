package BinarySearch;

import java.util.Scanner;

public class Pivot {
    static void inputArray(int arr[]){
        int n= arr.length;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
    }

    static int pivot(int arr[],int n){
        int s=0,e=n-1;
        int mid=s+(e-s)/2;
        while(s<e){
            if(arr[mid]>=arr[0]){
                s=mid+1;
            }
            else{
                e=mid;
            }
            mid=s+(e-s)/2;
        }
        return arr[s];
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
        int pivot=pivot(arr,n);
        System.out.println("Pivot Element: " + pivot);
    }
}
