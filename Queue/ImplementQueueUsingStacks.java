package Queue;

import java.util.*;

public class ImplementQueueUsingStacks {
//    Push -> O(1)
//    Pop -> O(n)
//    Peek -> O(n)
    class MyQueue {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> helper=new Stack<>();

        public void push(int x) {
            st.push(x);
        }

        public int pop() {
            while(st.size()>1){
                helper.push(st.pop());
            }
            int x=st.pop();
            while(helper.size()>0){
                st.push(helper.pop());
            }
            return x;
        }

        public int peek() {
            while(st.size()>1){
                helper.push(st.pop());
            }
            int x=st.peek();
            while(helper.size()>0){
                st.push(helper.pop());
            }
            return x;
        }

        public boolean empty() {
            if(st.size()==0)return true;
            return false;
        }
    }


//    Push -> O(n)
//    Pop -> O(1)
//    Peek -> O(1)
class MyQueue1 {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> helper=new Stack<>();

    public void push(int x) {
        if(st.size()==0){
            st.push(x);
        }
        else{
            while(st.size()>0){
                helper.push(st.pop());
            }
            st.push(x);
            while(helper.size()>0){
                st.push(helper.pop());
            }
        }
    }

    public int pop() {
        return st.pop();
    }

    public int peek() {
        return st.peek();
    }

    public boolean empty() {
        if(st.size()==0)return true;
        return false;
    }
}
}
