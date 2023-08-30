package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {

    static boolean isBalanced(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            } else{
                if(st.isEmpty()){
                    return false;
                }
                char top=st.peek();
                if((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    st.pop();
                }
                else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=s.next();
        if(isBalanced(str)){
            System.out.println("Balanced String");
        }
        else{
            System.out.println("Not Balanced String");
        }
    }
}
