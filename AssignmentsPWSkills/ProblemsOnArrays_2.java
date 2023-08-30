package AssignmentsPWSkills;

import java.util.Scanner;

public class ProblemsOnArrays_2 {
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
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Q1. Given an array arr[] of size n, find the first repeating element. The element should occur more than
//          once and the index of its first occurrence should be the smallest. If no repeating element exists, print -1.
/*

        System.out.print("Enter Length: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        boolean check =false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Element " + arr[i] + " Is Reapeating at Indexes " + i + "," + j);
                    check=true;
                    break;
                }
            }
        }
        if(!check){
            System.out.println("No Element Repeating");
        }
*/

//        Q2. Given an array of positive and negative numbers, arrange them in an alternate fashion such that
//          every positive number is followed by a negative and vice-versa maintaining the order of appearance.
//          The number of positive and negative numbers need not be equal. Begin with a negative number.
//          If there are more positive numbers, they appear at the end of the array. If there are more negative
//          numbers, they too appear at the end of the array.

//        TO BE DONE


//        Q3. Given arrival and departure times of all trains that reach a railway station. Find the minimum number
//          of platforms required for the railway station so that no train is kept waiting.
//          Consider that all the trains arrive on the same day and leave on the same day. Arrival and departure
//          time can never be the same for a train but we can have arrival time of one train equal to departure time
//          of the other. At any given instance of time, same platform can not be used for both departure of a train
//          and arrival of another train. In such cases, we need different platforms.
//        arr[] = {0900, 0940, 0950, 1100, 1500, 1800}
//        dep[] = {0910, 1200, 1120, 1130, 1900, 2000}
//        TO BE DONE

    }
}
