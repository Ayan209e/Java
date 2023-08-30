package Recursion;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class PrintArray {

    public static void printArray(int arr[],int i){
        if(i==arr.length){
            return;
        }
        System.out.print(arr[i]+ " ");
        printArray(arr,i+1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        printArray(arr,0);
    }
}
