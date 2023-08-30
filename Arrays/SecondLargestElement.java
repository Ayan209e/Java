package Arrays;

import java.util.Scanner;

public class SecondLargestElement {
    public static void InputArray(int arr[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        int largest=0,second=0;
        for(int ele:arr){
            if(ele>largest){
                largest=ele;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==largest){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        for(int ele:arr){
            if(ele>second){
                second=ele;
            }
        }

        System.out.println("Second Largest Element: " + second);
    }
}
