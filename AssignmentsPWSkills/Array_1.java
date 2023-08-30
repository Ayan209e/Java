package AssignmentsPWSkills;

import java.util.Arrays;
import java.util.Scanner;

public class Array_1 {
    public static void InputArray(int arr[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
    }

    public static void PrintArray(String arr[]) {
        for (String ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);

//        Q1. Given an array sorted in increasing order of size n and an integer x, find if there exists a
//          pair in the array whose absolute difference is exactly x.(n>1)
/*

        System.out.print("Enter Difference Value: ");
        int x=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]-arr[i]==x){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
*/

//        Q2. Given an array of size n, find the total number of occurrences of given number x.
        /*
        System.out.print("Enter Value Of X: ");
        int x=s.nextInt();
        int cnt=0;
        for(int ele:arr){
            if(ele==x){
                cnt++;
            }
        }
        System.out.println("Occurence Of " +x + " In Array: " +cnt );

*/

//        Q3. Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
//          missing number from the first N integers. There are no duplicates in the list.
/*

        Arrays.sort(arr);
        for(int i=1;i<=n;i++){
            if(arr[i-1]!=i){
                System.out.println("Missing Element: " + i);
                break;
            }
        }
*/

    }
}
