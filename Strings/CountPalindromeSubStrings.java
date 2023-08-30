package Strings;

import java.util.Scanner;

public class CountPalindromeSubStrings {

    public static boolean isPalindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str=s.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(isPalindrome(str.substring(i,j))==true){
                    System.out.println(str.substring(i,j));
                    count++;
                }
            }
        }
        System.out.println("Number Of Palindromic SubStrings: " + count);
    }
}
