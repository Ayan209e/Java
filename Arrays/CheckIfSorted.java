package Arrays;

import java.util.Scanner;

public class CheckIfSorted {
    public static void InputArray(int arr[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        boolean isSorted=false;
        for(int i=0;i<n-1;i++){
            if(arr[i]<=arr[i+1]){
                isSorted=true;
            }
            else{
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array Is Sorted");
        }
        else{
            System.out.println("Array Isn't Sorted");
        }
    }
}
