package Arrays;

import java.util.Scanner;

public class TargetSumTriplet {
    public static void InputArray(int arr[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        System.out.print("Enter Target Sum: ");
        int x=s.nextInt();

        System.out.println("Valid Triplets: ");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        System.out.println(arr[i] + " , " + arr[j] + " , " + arr[k]);
                    }
                }
            }
        }
    }
}
