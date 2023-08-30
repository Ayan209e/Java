package Strings;

import java.util.Scanner;

public class ReverseWordsOfString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=s.nextLine();
        StringBuilder ans=new StringBuilder("");
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{
                ans.append(sb.reverse());
                ans.append(" ");
                sb=new StringBuilder("");
            }
        }
        ans.append(sb.reverse());
        System.out.println("Result: " + ans);
    }

}
