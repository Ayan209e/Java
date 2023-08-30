package Arrays;

import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.print("Enter Size Of Array: ");
        int n=s.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int max=0;
        for(int ele:arr){
            if(ele>max){
                max=ele;
            }
        }
        System.out.println("Maximum: " + max);
    }
}
