package Arrays;

import java.util.Scanner;

public class SortSquaresOfElement {
//    Given an array in non-decreasing order, arrange the squares of elements in non-decreasing order.
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


    static void sortSquares(int arr[]){
        int i=0,j=arr.length-1;
        while(i<=j){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                arr[i]=arr[i]+arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
                j--;
            }
            else{
                i++;
            }
        }
        for(int k=0;k< arr.length;k++){
            arr[k]=arr[k]*arr[k];
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        sortSquares(arr);
        PrintArray(arr);
    }

}
