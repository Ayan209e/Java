package Arrays;

import java.util.Scanner;

public class Reverse {

    static void reverse(int arr[]){
        int s=0,e=arr.length-1;
        while(s<=e){
            int temp=arr[e];
            arr[e]=arr[s];
            arr[s]=temp;
            e--;s++;
        }
    }


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

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        reverse(arr);
        PrintArray(arr);
    }
}
