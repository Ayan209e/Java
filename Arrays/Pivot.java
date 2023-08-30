package Array;

import java.util.Scanner;

public class Pivot {
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
    static int pivot(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]>=arr[0]){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int arr[]=inputArray();
        System.out.println("Pivot: " + pivot(arr));
    }
}
