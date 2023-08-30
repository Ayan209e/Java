package Recursion;

import java.util.Scanner;

public class PowerOfANumber {

    public static int power(int p,int q){
        if(q==1){
            return p;
        }
        if(q%2==0){
            return power(p,q/2) * power(p,q/2);
        }
        else{
            return p * power(p,q/2) * power(p,q/2);
        }

//        OR

//        if(q==1){
//            return p;
//        }
//        return p * power(p,q-1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter P: ");
        int p=s.nextInt();
        System.out.print("Enter Q: ");
        int q=s.nextInt();
        System.out.println(("Power " + p + "^" + q +" : " + power(p,q)));
    }
}
