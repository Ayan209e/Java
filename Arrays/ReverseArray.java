package Array;

import java.util.Scanner;

public class ReverseArray {
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

    static void reverse(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;e--;
        }
    }

    public static void main(String[] args) {
        int arr[]=inputArray();
        reverse(arr);
        printArray(arr);
    }
}
