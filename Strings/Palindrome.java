package Strings;

import java.util.Scanner;
//Incomplete
public class Palindrome {
    public static boolean isPalindrome(String str){
        str.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                sb.append(ch);
            }
        }
        String st="" + sb;
        int i=0;
        int j=st.length()-1;

        while(i<=j){
            if((st.charAt(i)==st.charAt(j))){
                i++;j--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.next();
        if(isPalindrome(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
