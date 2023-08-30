package NumberSystem;

import java.util.Scanner;

public class PowerOfX {

    static boolean isPow(int n,int x){
        if(n==0)return false;
        if(n==1)return true;
        return (n%x==0) ? isPow(n/x,x) : false;
    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=s.nextInt();
        System.out.print("Enter X, To Check If Power Of X: ");
        int x=s.nextInt();
        if(isPow(n,x)){
            System.out.println(n + " Is A Power Of " + x);
        }
        else{
            System.out.println(n + " Is Not A Power Of " + x);
        }
    }
}
