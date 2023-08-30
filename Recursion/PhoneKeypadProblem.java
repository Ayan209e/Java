package Recursion;

import java.util.Scanner;

public class PhoneKeypadProblem {

    static void combinations(String dig,String kp[],String res){//253
        if(dig.length()==0){
            System.out.print(res + " ");
            return;
        }
        int currNum=dig.charAt(0)-'0';//2
        String currChoices=kp[currNum];//kp[2] ->"abc"
        for(int i=0;i<currChoices.length();i++){//choices for each char -> a,b,c
            combinations(dig.substring(1),kp,res+currChoices.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Digits String: ");
        String st=s.next();
        String kp[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//                    0  1   2     3     4     5     6     7      8     9
        combinations(st,kp,"");
    }
}
