package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Display {

    public static void display(Stack<Integer> st){
        Stack<Integer> temp=new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        while(!temp.isEmpty()){
            int x=temp.pop();
            System.out.print(x + " ");
            st.push(x);
        }
    }

    public static void displayRec(Stack<Integer> st){
        if(st.isEmpty())return;
        int top=st.pop();
        displayRec(st);
        System.out.print(top + " ");
        st.push(top);
    }

    public static void displayRev(Stack<Integer> st){
        if(st.isEmpty())return;
        int top=st.pop();
        System.out.print(top + " ");
        displayRev(st);
        st.push(top);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.print("Enter No. Of Elements: ");
        int n=s.nextInt();
        System.out.print("Enter Stack Elements: ");
        for(int i=0;i<n;i++){
            int x=s.nextInt();
            st.push(x);
        }

        displayRec(st);
        System.out.println();
        displayRev(st);
    }
}
