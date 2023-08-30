package Arrays;

import java.util.Scanner;

public class SmallestLargestElement {
    public static void InputArray(int arr[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
    }

    static int[] SmallestLargest(int arr[]){
        int min=100000,max=0;
        int ans[]=new int[2];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];
            }
            if(arr[i]<=min){
                min=arr[i];
            }
        }
        ans[0]=min;
        ans[1]=max;
        return ans;
    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        int ans[]=new int[2];
        ans=SmallestLargest(arr);
        System.out.println("Smallest Element: " + ans[0]);
        System.out.println("Largest Element: " + ans[1]);
    }
}
