package Array;

import java.util.Scanner;

public class SquareRoot {

    static int sqrt(int n){
        int s=0,e=n;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int sq=mid*mid;
            if(sq==n){
                return mid;
            }
            else if(sq<n){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }

    static double morePrecision(int n,int precision,int tempSol){
        double factor=1;
        double ans=tempSol;
        for(int i=0;i<precision;i++){
            factor/=10;
            for(double j=ans;j*j<n;j=j+factor){
                ans=j;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=s.nextInt();
        int tempSol=sqrt(n);
        System.out.printf("Square Root: %.3f" ,morePrecision(n,3,tempSol));
    }
}
