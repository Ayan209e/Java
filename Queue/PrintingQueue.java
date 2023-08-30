package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class PrintingQueue {

    static void display(Queue<Integer> q){
        Queue<Integer> helper= new LinkedList<>();
        while(q.size()!=0){
            int ele=q.remove();
            System.out.print(ele +" ");
            helper.add(ele);
        }
        while (helper.size()!=0){
            q.add(helper.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        display(q);
        System.out.println();
        System.out.println(q);
    }
}
