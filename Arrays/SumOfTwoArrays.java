package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfTwoArrays {
    public static int[] findArraySum(int[] a, int n, int[] b, int m) {
        // Write your code here.
        int i=n-1;
        int j=m-1;
        int carry=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while(i>=0 && j>=0){
            int val1=a[i];
            int val2=b[j];
            int sum=val1+val2+carry;
            carry=sum/10;
            sum=sum%10;
            ans.add(sum);
            i--;j--;
        }
        while(i>=0){
            int sum=a[i]+carry;
            carry=sum/10;
            sum=sum%10;
            ans.add(sum);
            i--;
        }
        while(j>=0){
            int sum=b[j]+carry;
            carry=sum/10;
            sum=sum%10;
            ans.add(sum);
            j--;
        }
        while(carry!=0){
            int sum=carry;
            carry=sum/10;
            sum=sum%10;
            ans.add(sum);
        }
        int l=ans.size();
        int res[]=new int[l];
        for( i=0;i<l;i++){
            res[i]=ans.get(i);
        }
        i=0;j=l-1;
        while(i<=j){
            int temp=res[i];
            res[i]=res[j];
            res[j]=temp;
            i++;j--;
        }
        return res;
    }
    static int[] inputArray(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }

    static void printArray(int arr[]){
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[]=inputArray();
        int arr2[]=inputArray();
        int ans[]=findArraySum(arr1,arr1.length,arr2,arr2.length);
        for(int ele:ans){
            System.out.print(ele + " ");
        }
    }
}
