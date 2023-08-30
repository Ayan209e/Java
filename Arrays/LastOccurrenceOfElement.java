package Arrays;

import java.util.Scanner;

public class LastOccurrenceOfElement {
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
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        System.out.print("Enter Element To Find Last Occurrence: ");
        int x=s.nextInt();
        int ans=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                ans=i;
            }
        }
        System.out.println("Last Occurrence Of " + x + " In Array Is: " + ans);
    }
}
