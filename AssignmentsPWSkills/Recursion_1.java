package AssignmentsPWSkills;

import java.util.Scanner;

public class Recursion_1 {

    static void seriesPrint(int n,int m,boolean flag){
        System.out.print(m + " ");
        if (flag == false && n == m) {
            return;
        }

        if (flag) {
            if (m - 5 > 0) {
                seriesPrint(n, m - 5, true);
            }
            else {
                seriesPrint(n, m - 5, false);
            }
        }
        else {
            seriesPrint(n, m + 5, false);
        }
    }

    static int mthSummation(int n,int m){
        if(m==1){
            return sumOfN(n);
        }
        int sum=mthSummation(n,m-1);
        return sumOfN(sum);
    }

    static int sumOfN(int n){
        int ans=0;
        if(n==1){
            return 1;
        }
        ans += n+ sumOfN(n-1);
        return ans;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);


//        Q1 - Given a number n, print the following pattern without using any loop.
//            n, n-5, n-10, …, 0, 5, 10, …, n-5, n
        /*
            System.out.print("Enter Value: ");
            int n=s.nextInt();
            seriesPrint(n,n,true);
*/


//        Q2 - Find m-th summation of first n natural numbers where m-th summation of first n natural numbers is defined as following:
//          If m > 1: SUM(n, m) = SUM(SUM(n, m - 1), 1)
//          Else :SUM(n, 1) = Sum of first n natural numbers.

        System.out.print("Enter Value N: ");
        int n=s.nextInt();
        System.out.print("Enter Value M: ");
        int m=s.nextInt();
        System.out.println("M-th Summation: " + mthSummation(n,m));


    }
}
