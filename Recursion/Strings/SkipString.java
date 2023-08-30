package Recursion.Strings;

import java.util.Scanner;

public class SkipString {

    static String skipString(String up,String x){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith(x)){
            return skipString(up.substring(x.length()),x);
        }
        else{
            return up.charAt(0) + skipString(up.substring(1),x);
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter String: ");
        String st=s.next();
        System.out.print("Enter String To Skip: ");
        String x=s.next();
        System.out.println(skipString(st,x));
    }
}
