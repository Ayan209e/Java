package LinkedList.DoublyLinkedList;

public class Insertion {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int val){
            this.data=val;
        }
    }

    static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    static Node insertAtHead(Node head,int x){
        Node t=new Node(x);
        t.next=head;
        head.prev=t;
        head=t;
        return head;
    }

    static void insertAtTail(Node head,int x){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t=new Node(x);
        temp.next=t;
        t.prev=temp;
    }

    static void insert(Node head,int idx,int x){
        Node t=new Node(x);
        Node s=head;
        for (int i=1;i<idx;i++){
            s=s.next;
        }
        Node r=s.next;
//        s r -> after insertion -> s t r
        s.next=t;
        t.next=r;
        r.prev=t;
        t.prev=s;
    }

    static Node deleteHead(Node head){
        head=head.next;
        head.prev=null;
        return head;
    }

    static void deleteTail(Node head){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    static Node delete(Node head,int idx){
        if(idx==0){
            head=head.next;
            head.prev=null;
            return head;
        }
        Node temp=head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        if(temp.next==null){
            temp=temp.prev;
            temp.next=null;
            return head;
        }
        temp.next=temp.next.next;
        temp.next.prev=head;
        return head;
    }


    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(6);
        Node c=new Node(13);
        Node d=new Node(5);
        Node e=new Node(8);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        display(a);
//        a=insertAtHead(a,11);
//        insertAtTail(a,15);
//        insert(a,3,21);
//        deleteTail(a);
        a=delete(a,2);
        display(a);

    }
}
