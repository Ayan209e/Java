package Stack;

import java.nio.file.DirectoryStream;
import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String infix="9-(5+3)*4/6";  // 4
        Stack<String> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);
            int ascii=(int)ch;
            if(ascii>48 && ascii<=57){ // 0 to 9
                String s="" + ch;
                val.push(s);
            }
            else if (op.size()==0 || ch=='(' || op.peek()=='(') {
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='('){
                    // Work
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=op.pop();
                    String t=o + v1 + v2;
                    val.push(t);
                }
                op.pop();
            }
            else{
                if(ch=='+' || ch=='-'){
                    // Work
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=op.pop();
                    String t=o + v1 + v2;
                    val.push(t);
                    // Push
                    op.push(ch);
                }
                else if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        // Work
                        String v2=val.pop();
                        String v1=val.pop();
                        char o=op.pop();
                        String t=o + v1 + v2;
                        val.push(t);
                        // Push
                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }
//        val stack size -> 1
        while(val.size()>1){
            String v2=val.pop();
            String v1=val.pop();
            char o=op.pop();
            String t=o + v1 + v2;
            val.push(t);
        }
        String prefix=val.pop();
        System.out.println("Result: " + prefix);
    }
}