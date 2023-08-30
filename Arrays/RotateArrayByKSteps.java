package Arrays;

import java.util.Scanner;

public class RotateArrayByKSteps {
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

    static void reverse(int arr[],int s,int e){
        while(s<=e){
            int temp=arr[e];
            arr[e]=arr[s];
            arr[s]=temp;
            e--;s++;
        }
    }

    /*public static int[] rotateByKSteps(int arr[],int k){  //Using another array
        int n=arr.length;
        int ans[]=new int[n];
        k=k%n;
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }*/

    public static void rotateByKSteps(int arr[],int k){
        int n=arr.length;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        System.out.print("Enter Value Of K: ");
        int k=s.nextInt();
        rotateByKSteps(arr,k);
        System.out.println("Rotated Array: ");
        PrintArray(arr);
    }
}
