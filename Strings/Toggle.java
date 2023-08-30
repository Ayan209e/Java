package Strings;

import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter String: ");
        StringBuilder st=new StringBuilder(s.nextLine());
        for(int i=0;i<st.length();i++){
            boolean flag=true; //true-> capital
            char ch= st.charAt(i);
            int asci=(int)ch;
            if(asci>=97){
                flag=false; //small letter
            }

            if(flag==true){
                asci+=32;
            }
            else{
                asci-=32;
            }
            char dh=(char)asci;
            st.setCharAt(i,dh);
        }
        System.out.print("Toggled String: " + st);
    }
}
