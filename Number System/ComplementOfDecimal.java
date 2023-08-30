package NumberSystem;

import java.util.Scanner;

public class ComplementOfDecimal {

    static int complement(int n){
        if(n==0){
            return 1;
        }
        int m=n;
        int mask=0;
        while(m!=0){
            mask=(mask<<1)|1;
            m=m>>1;
        }
        int ans=(~n)&mask;
        return ans;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Deciaml Number: ");
        int n=s.nextInt();
        System.out.println("Complement : " + complement(n));
    }
}
