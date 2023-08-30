package Strings;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=s.next();
        int count=1;
        StringBuilder ans=new StringBuilder(""+str.charAt(0));
        for(int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            char prev=str.charAt(i-1);
            if(curr==prev){
                count++;
            }
            else{
                if(count!=1){
                    ans.append(count);
                }
                count=1;
                ans.append(curr);
            }
        }
        if(count!=1){
            ans.append(count);
        }
        System.out.println("Compressed String: " +ans);
    }
}
