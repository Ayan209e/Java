package AssignmentsPWSkills;

import java.util.Scanner;

public class Array {
    public static void InputArray(int arr[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
    }

    public static void PrintArray(String arr[]){
        for(String ele:arr){
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

//        Q1. Print Only positive elements in array
/*
        System.out.print("Enter Length: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        for(int ele:arr){
            if(ele>=0){
                System.out.print(ele+ " ");
            }
        }
        */


//        Q2. Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings and print all
//              strings stored on odd indices of the array.
        /*
        String arr[]={"ab","bc","cd","de","ef","fg","gh"};
        PrintArray(arr);
*/

//        Q3. Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even elements.
/*
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        for(int ele:arr){
            if(ele%2==0){
                System.out.print(ele + " ");
            }
        }
        */


//        Q4. Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method
//          for calculating the minimum element.
/*

        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        int min=1000;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum: " +min);
*/

//        Q5.Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0}
//          Peak element is the one which is greater than its immediate left neighbor and its immediate right neighbor.
//          Leftmost and rightmost element cannot be a peak element.
/*

        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        for(int i=1;i<n-1;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                System.out.println("Peak Element: " + arr[i]);
                break;
            }
        }

*/


    }
}
