package Recursion;

//1-2+3-4+5-6....

import java.util.Scanner;

public class AlternateSumSeries {

    public static int alternateSumSeries(int n){
        if(n==1){
            return n;
        }
        if(n%2==0){
            return alternateSumSeries(n-1) - n;
        }
        else{
            return alternateSumSeries(n-1) + n;
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Last Number: ");
        int n=s.nextInt();
        System.out.print("Sum Of Series Till " +n +" Is: "+ alternateSumSeries(n));
    }
}
