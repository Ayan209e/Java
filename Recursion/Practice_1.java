package Recursion;

import java.util.Scanner;

public class Practice_1 {

    static void printnTo1(int n){
        if(n<=0) return;
        System.out.print(n + " ");
        printnTo1(n-1);
    }
    static void print1ToN(int n){
        if(n<=0) return;
        print1ToN(n-1);
        System.out.print(n + " ");
    }

    static int digitSum(int n){
        if(n==0)return 0;
        return (n%10) + digitSum((n/10));
    }

    static int productSum(int n){
        if(n==1)return 1;
        return (n%10) * productSum((n/10));
    }


    static int fact(int n){
        if(n==1) return n;
        return n*fact(n-1);
    }

//    static int cnt=0;
    static int countZeros(int n,int cnt){
        if(n==0)return cnt;
        if(n%10==0){
            return countZeros(n/10,cnt+1);
        }
        return countZeros(n/10,cnt);


//        return cnt;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=s.nextInt();
        System.out.println("No. Of Zeros: " + countZeros(n,0));
    }

}
