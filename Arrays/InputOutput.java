package Arrays;

import java.util.Scanner;

public class InputOutput {

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
        System.out.print("Enter Length: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        PrintArray(arr);

    }
}
