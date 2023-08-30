package Queue;

import java.util.*;

public class ImplementStacksUsingQueue {
//    Push -> O(1)
//    Pop -> O(n)
//    Peek -> O(n)
    class MyStack {
        Queue<Integer> q=new LinkedList<>();

        public void push(int x) {
            q.add(x);
        }

        public int pop() {
            for(int i=1;i<=q.size()-1;i++){
                q.add(q.remove());
            }
            int x=q.peek();
            q.remove();
            return x;
        }

        public int top() {
            for(int i=1;i<=q.size()-1;i++){
                q.add(q.remove());
            }
            int x=q.peek();
            q.add(q.remove());
            return x;
        }

        public boolean empty() {
            if(q.size()==0)return true;
            return false;
        }
    }


//    Push -> O(n)
//    Pop -> O(1)
//    Peek -> O(1)
class MyStack2 {
    Queue<Integer> q=new LinkedList<>();

    public void push(int x) {
        if(q.size()==0)q.add(x);
        else{
            q.add(x);
            for(int i=1;i<=q.size()-1;i++){
                q.add(q.remove());
            }
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        if(q.size()==0)return true;
        return false;
    }
}

}
