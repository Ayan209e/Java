package Array;

import java.util.Scanner;

//Array contains numbers from 1 to n only, only one element is duplicate
public class DuplicateElement {
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

    static int duplicate(int arr[]){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans^arr[i];
        }
        for(int i=1;i<arr.length;i++){
            ans=ans^i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]=inputArray();
        System.out.println("Duplicate Element: " + duplicate(arr));
    }
}
