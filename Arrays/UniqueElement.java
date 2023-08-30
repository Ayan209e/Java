package Arrays;

import java.util.Scanner;

public class UniqueElement {
    public static void InputArray(int arr[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        InputArray(arr);

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        boolean unique=false;
        for(int ele:arr){
            if(ele !=-1){
                System.out.println("Unique Element: " + ele);
                unique=true;
            }
        }
        if(!unique){
            System.out.println("No Unique Element Found");
        }

    }
}
