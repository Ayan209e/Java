package Strings;

import java.util.Scanner;

public class LargestStringLexicographically {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter No. Of Strings: ");
        int n=s.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=s.next();
        }
        String largest=arr[0];
        for(int i=0;i<n;i++){
            if(largest.compareTo(arr[i])<0){
                largest=arr[i];
            }
        }
        System.out.println("Largest String: " +largest);
    }
}
