package Sorting;

import java.util.Scanner;

public class CountSort {
    static int[] inputArray(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    static void printArray(int[] arr){
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }

    static void countSort(int[] arr){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int[] count =new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int j=0;
        for (int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr =inputArray();
        countSort(arr);
        printArray(arr);
    }
}
