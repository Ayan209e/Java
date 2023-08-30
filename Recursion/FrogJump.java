package Recursion;

import java.util.Scanner;

public class FrogJump {

    static int best(int h[],int n,int i){
        if(i==n-1)return 0;

        int opt1=Math.abs(h[i]-h[i+1])+best(h,n,i+1);

        if(i==n-2)return opt1;

        int opt2=Math.abs(h[i]-h[i+2])+best(h,n,i+2);

        return Math.min(opt1,opt2);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter Array: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Minimum Cost: " + best(arr,n,0));
    }
}
