package Arrays;

import java.util.Scanner;

public class NumberGreaterThanGivenElement {
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
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        System.out.print("Enter Value Of X: ");
        int x=s.nextInt();
        int cnt=0;
        for(int ele:arr){
            if(ele>x){
                cnt++;
            }
        }
        System.out.println("Elements Greater Than " + x + " In Array Are: " + cnt);
    }
}
