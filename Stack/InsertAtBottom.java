package Stack;

import java.util.Scanner;
import java.util.Stack;

public class InsertAtBottom {
    public static void insertAtBottom(Stack<Integer> st,int x){
        Stack<Integer> temp=new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        st.push(x);
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
    }

    public static void insert(Stack<Integer> st,int idx,int x ){
        Stack<Integer> temp=new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(x);
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
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
        System.out.print("Enter Element To Insert At Bottom: ");
        int x=s.nextInt();
        System.out.print("Enter Index: ");
        int i=s.nextInt();
//        insertAtBottom(st,x);
        insert(st,i,x);
        System.out.println(st);
    }
}
