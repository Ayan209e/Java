package Array;

import java.util.Scanner;

public class MoveZeros {
    static int[] inputArray(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }

    static void printArray(int arr[]){
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }

    static void moveZeros(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    arr[j]=arr[j+1];
                    arr[j+1]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]=inputArray();
        moveZeros(arr);
        printArray(arr);
    }


}
