package Arrays;

import java.util.Scanner;

public class LeftNRightSumEqual {
    public static int checkSum(int[] arr) {
        int n=arr.length;
        int totalSum=0;
        int leftSum=0;
        for(int ele:arr){
            totalSum+=ele;
        }
        for(int i=0;i<n;leftSum+=arr[i++]){
            if(leftSum*2==totalSum-arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void InputArray(int arr[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        System.out.println("Index: " + checkSum(arr));
    }
}
