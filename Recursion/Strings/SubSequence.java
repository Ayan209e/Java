package Recursion.Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSequence {

    static void subSeq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subSeq(p,up.substring(1));
        subSeq(p+ch,up.substring(1));
    }

    static ArrayList<String> subSeqRet(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        char ch=up.charAt(0);
        ArrayList<String> right=subSeqRet(p,up.substring(1));
        ArrayList<String> left=subSeqRet(p+ch,up.substring(1));
        left.addAll(right);
        return left;
    }


    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter String: ");
        String st=s.next();
//        subSeq("",st);
        System.out.println(subSeqRet("",st));
    }
}
