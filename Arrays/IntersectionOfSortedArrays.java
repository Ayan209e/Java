package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfSortedArrays {
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

    static void printArray(int arr[]){
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }

    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        int n=arr1.length;
        int m=arr2.length;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                ans.add(arr1[i]);
                i++;j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr1[]=inputArray();
        int arr2[]=inputArray();
        ArrayList<Integer> ans=intersection(arr1,arr2);
        System.out.println(ans.toString());

    }
}
