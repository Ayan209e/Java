package Arrays;

import java.util.Scanner;

public class SearchUsingFrequencyArray {
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
        int freqlen=(int) Math.pow(10,5);
        int freq[]=new int[freqlen+1];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }

        System.out.print("Enter No. Of Queries: ");
        int q=s.nextInt();
        for(int i=0;i<q;i++){
            System.out.println("Enter Element To Search: ");
            int ele=s.nextInt();
            if(freq[ele]>0){
                System.out.println("Element Present In Array");
            }
            else{
                System.out.println("Element Not Present");
            }
        }
    }
}
