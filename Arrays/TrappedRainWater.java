package Arrays;

//Time Complexity : O(n)

import java.util.Scanner;

public class TrappedRainWater {
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

    static int trappedWater(int arr[]){
        int n=arr.length;

//        Calculate left max boundary
        int leftMax[]=new int[n];
        leftMax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);
        }

//        Calculate right max boundary
        int rightMax[]=new int[n];
        rightMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(arr[i],rightMax[i+1]);
        }

        int ans=0;
        for(int i=0;i<n;i++){
//            Water Level= min( left max bound, right max bound)
            int waterLevel=Math.min(leftMax[i],rightMax[i]);

//            Water Trapped= water level-height;
            ans+=waterLevel-arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]=inputArray();
        System.out.println("Trapped Water: " + trappedWater(arr));
    }
}
