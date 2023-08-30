package Arrays;

import java.util.Scanner;

public class PrintSubArray {
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

    static void printSubArray(int arr[]){
        int n=arr.length;
        int cnt=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] + " ");
                    cnt++;
                }
                System.out.println();
            }
        }
        System.out.println("Total SubArrays: " + cnt);
    }

    public static void main(String[] args) {
        int arr[]=inputArray();
        printSubArray(arr);
    }
}
