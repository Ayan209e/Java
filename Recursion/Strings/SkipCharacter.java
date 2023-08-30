package Recursion.Strings;

import java.util.Scanner;

public class SkipCharacter {

    static void skip(String p,String up,char x){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch==x){
            skip(p,up.substring(1),x);
        }
        else{
            skip(p+ch,up.substring(1),x);
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter String: ");
        String st=s.next();
        System.out.print("Enter Character To Skip: ");
        char ch=s.next().charAt(0);
        skip("",st,ch);
    }

}
