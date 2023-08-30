package Recursion.Strings;

import java.util.Scanner;

public class ReverseString {
    static String reverseString(String st,int i){
        if(i==st.length()){
            return "";
        }
        char ch=st.charAt(i);
        String smallAns=reverseString(st,i+1);
        return smallAns+ch;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter String: ");
        String st=s.next();
        String ans=reverseString(st,0);
        System.out.println("Result: "+ ans);
    }
}
