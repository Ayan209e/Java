package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        System.out.print("Enter Element To Find: ");
        int x=s.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println("Found Element At " + i + " Index");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Element Not Found");
        }
    }
}
