package Array;

import java.util.Scanner;

public class MergeTwoSortedArray {
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

    static int[] merge(int arr1[],int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int ans[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                ans[k++]=arr1[i++];
            }
            else{
                ans[k++]=arr2[j++];
            }
        }
        while(i<n){
            ans[k++]=arr1[i++];
        }
        while(j<m){
            ans[k++]=arr2[j++];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr1[]=inputArray();
        int arr2[]=inputArray();
        int ans[]=merge(arr1,arr2);
        printArray(ans);
    }
}
