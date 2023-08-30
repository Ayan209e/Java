package Recursion.Strings;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PermutationOfString {

    static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutation(f+ch+s,up.substring(1));
        }
    }

    static ArrayList<String> permutationRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }

        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(permutationRet(f+ch+s,up.substring(1)));
        }

        return  ans;
    }
    static int countPermutation(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            count= count + countPermutation(f+ch+s,up.substring(1));
        }
        return count;
    }
//    static void permutation(String st,String ans){
//        if(st.length()==0){
//            System.out.print(ans + " ");
//            return;
//        }
//        for(int i=0;i<st.length();i++){
//            char ch=st.charAt(i);
//            String res=st.substring(0,i) + st.substring(i+1);
//            permutation(res,ans+ch);
//        }
//    }


    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter String: ");
        String st=s.next();
        System.out.println(countPermutation("",st));
    }
}
