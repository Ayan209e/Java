package Sorting;

import java.util.Scanner;

public class SortAccToLexicalValues {
    static void inputArray(String arr[]){
        int n= arr.length;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=s.next();
        }
    }

    static void SortAccToLexico(String arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1 ;j<n;j++){
                int cmp=arr[j].compareTo(arr[minIndex]);
                if(cmp<0){//arr[i]<arr[minIndex]
                    minIndex=j;
                }
            }
            String temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }

    static void printArray(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Lenght Of Array: ");
        int n=s.nextInt();
        String arr[]=new String[n];
        inputArray(arr);
        SortAccToLexico(arr);
        printArray(arr);
    }
}
