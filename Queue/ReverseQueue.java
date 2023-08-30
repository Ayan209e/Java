package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static void reverse(Queue<Integer> q){
        Stack<Integer> temp=new Stack<>();
        while(q.size()>0){
            temp.push(q.remove());
        }
        while(temp.size()>0){
            q.add(temp.pop());
        }
    }

    public static void reverseFirstK(Queue<Integer> q,int k){
        Stack<Integer> temp=new Stack<>();
        Queue<Integer> qt=new LinkedList<>();
        for(int i=1;i<=k;i++){
            temp.push(q.remove());
        }
        while(q.size()>0){
            qt.add(q.remove());
        }
        while(temp.size()>0){
            q.add(temp.pop());
        }
        while(qt.size()>0){
            q.add(qt.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
//        reverse(q);
//        System.out.println(q);
        int k=2;
        reverseFirstK(q,k);
        System.out.println(q);
    }
}
