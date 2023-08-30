package Arrays;

import java.util.*;

public class PairSum {
    public static void InputArray(int arr[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
    }

    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        List<int[]> ans=new ArrayList();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<=arr[j])
                {
                    if(arr[i]+arr[j]==s)
                    {
                        int temp[]=new int[2];
                        temp[0]=arr[i];
                        temp[1]=arr[j];
                        ans.add(temp);
                        continue;
                    }
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        System.out.print("Enter Target Sum: ");
        int x=s.nextInt();
        List<int[]> ans=pairSum(arr,x);
        for(int i=0;i<ans.size();i++){
            int temp[]=ans.get(i);
            for(int ele:temp){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

    }
}
