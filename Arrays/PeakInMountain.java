package Array;

import java.util.Scanner;

public class PeakInMountain {

    static int peak(int arr[]){
        int ans=0;
        int n=arr.length;
        int s=0,e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return arr[mid];
            }
            else if (arr[mid]>arr[mid-1]) {
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return ans=0;
    }

    static int[] inputArray(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]=inputArray();
        System.out.println("Peak Element: " + peak(arr));
    }
}
