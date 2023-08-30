package LinkedList;

public class Reverse {
    public static class Node {
        int data;
        Node next;
        Node(int x){
            data = x;
        }
    }

//    O(n) Space
    public static Node reverseRec(Node head){
        if(head.next==null)return head;
        Node newNode=reverseRec(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }

//    O(1) Space
    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null,agla=null;
        while(curr!=null){
            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;
        }
        return prev;
    }

    public static void display(Node head){
        if(head==null)return;
        System.out.print(head.data + " ");
        display(head.next);
    }

    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(6);
        Node c=new Node(3);
        Node d=new Node(8);
        Node e=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
        a=reverseRec(a);
        System.out.println();
        display(a);
    }

}
