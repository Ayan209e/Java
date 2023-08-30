package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TripletSum {
    static int[] inputArray(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int l=i+1,r=n-1;
            while(l<r){ 
                if((arr[i]+arr[l]+arr[r])==K){
                    ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[l]);
                    temp.add(arr[r]);
                    ans.add(temp);

                    while(l<r && arr[l]==arr[l+1]){
                        l++;
                    }
                    while(l<r && arr[r]==arr[r-1]){
                        r--;
                    }
                    l++;r--;
                }
                else if(arr[i]+arr[l]+arr[r]<K){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int arr[] = inputArray();
        System.out.print("Enter Target Sum: ");
        int x = s.nextInt();
        ArrayList<ArrayList<Integer>> ans = findTriplets(arr, arr.length, x);
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
