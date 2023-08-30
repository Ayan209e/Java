package Loops;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {

//        Series: 1 - 2 + 3 - 4 + 5.......n

        Scanner s=new Scanner(System.in);
        System.out.print("Enter Last Element Of Series:");
        int n=s.nextInt();
        int sum=0,i=1;
        while(i<=n){
            if(i%2==0){
                sum-=i;
            }
            else{
                sum+=i;
            }
            i++;
        }
        System.out.println("Sum :"+ sum);


    }
}
