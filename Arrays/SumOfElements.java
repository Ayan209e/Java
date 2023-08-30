package Arrays;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        int sum=0;
        for(int ele: arr){
            sum += ele;
        }
        System.out.println("Sum: " + sum);

    }
}
