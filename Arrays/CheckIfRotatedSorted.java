package Array;

import java.util.Scanner;

public class CheckIfRotatedSorted {
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

    static void printArray(int arr[]){
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }

    static boolean check(int arr[]){
        int n=arr.length;
        int cnt=0;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                cnt++;
            }
        }
        if(arr[n-1]>arr[0]){
            cnt++;
        }
        if(cnt<=1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]=inputArray();
        if(check(arr)){
            System.out.println("Rotated Sorted");
        }
        else{
            System.out.println("Not Rotated Sorted");
        }

    }
}
