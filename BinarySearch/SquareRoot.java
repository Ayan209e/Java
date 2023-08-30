package BinarySearch;

import java.util.Scanner;

public class SquareRoot {
    public static int sqrtN(long n) {
        long s=0,e=n;
        long mid=s+(e-s)/2;
        long ans=-1;
        while(s<=e){
            long sq=mid*mid;
            if(sq==n){
                return (int)mid;
            }
            else if(sq<n){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return (int)ans;
    }

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=s.nextInt();
        System.out.println("Square Root Of " + n + " Is: " + sqrtN(n));
    }
}
