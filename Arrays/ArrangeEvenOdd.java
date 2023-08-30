package Arrays;

import java.util.Scanner;

public class ArrangeEvenOdd {
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

    static void swap(int a,int b){

    }
    static void arrangeevenodd(int arr[]){
        int i=0,j=arr.length-1;
        while(i<=j){
            if(arr[i]%2==0){
                i++;
            }
            else if((arr[j]%2) != 0){
                j--;
            }
            else{
                arr[i]=arr[i]+arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
                i++;j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        arrangeevenodd(arr);
        PrintArray(arr);
    }
}
