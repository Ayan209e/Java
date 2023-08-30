package Recursion.Strings;

import java.util.Scanner;

public class PalindromeString {
    static boolean isPalindrome(String st,int l,int r){
        if(l>=r){
            return true;
        }
        return (st.charAt(l)==st.charAt(r) && isPalindrome(st,l+1,r-1));
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter String: ");
        String st=s.next();
        boolean ans=isPalindrome(st,0,st.length()-1);
        if(ans){
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
