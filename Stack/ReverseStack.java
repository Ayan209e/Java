package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {

    public static void  reverse(Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        Stack<Integer> copy = new Stack<>();
        while(!temp.isEmpty()){
            copy.push(temp.pop());
        }

        while(!copy.isEmpty()){
            st.push(copy.pop());
        }
    }

    public static void pushAtBottom(Stack<Integer> st,int x){
        Stack<Integer> temp=new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        st.push(x);
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
    }
    public static void reverseRec(Stack<Integer> st){
        if(st.size()==1)return;
        int top=st.pop();
        reverseRec(st);
        pushAtBottom(st,top);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter No. Of Elements: ");
        int n = s.nextInt();
        System.out.print("Enter Stack Elements: ");
        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            st.push(x);
        }
        System.out.println(st);
        reverseRec(st);
        System.out.println(st);

    }
}
