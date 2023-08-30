package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

        public static int linearSearch(int arr[],int i,int x){
            if(i==arr.length){
                return -1;
            }
            if(arr[i]==x){
                return i;
            }
            return linearSearch(arr,i+1,x);
        }

    public static void printAllIndices(int arr[],int i,int x){
        if(i==arr.length){
            return;
        }
        if(arr[i]==x){
            System.out.print(i + " ");;
        }
        printAllIndices(arr,i+1,x);
    }

        public static ArrayList<Integer> findAllIndices(int arr[],int i,int x){
            if(i==arr.length){
                return new ArrayList<Integer>();
            }
            ArrayList<Integer> ans=new ArrayList<>();
            if(arr[i]==x){
                ans.add(i);
            }
            ArrayList<Integer> smallAns=findAllIndices(arr,i+1,x);
            ans.addAll(smallAns);
            return ans;
        }


        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.print("Enter Length Of Array: ");
            int n=s.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            System.out.print("Enter Element To Search: ");
            int x=s.nextInt();
//            int ans=linearSearch(arr,0,x);
//            if(ans!=-1){
//                System.out.println("Element Found At: " + ans + " Index");
//            }
//            else{
//                System.out.println("Element Not Present");
//            }
            ArrayList<Integer> ans=findAllIndices(arr,0,x);
            for(int i:ans){
                System.out.print(i + " ");
            }


        }
}
