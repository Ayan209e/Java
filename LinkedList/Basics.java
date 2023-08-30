package LinkedList;

public class Basics {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }

    public static void displayRec(Node head){
        if(head==null) return;
        System.out.print(head.data + " ");
        displayRec(head.next);
    }

    public static void displayRev(Node head){
        if(head==null) return;
        displayRec(head.next);
        System.out.print(head.data + " ");
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

//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);

        display(a);
        System.out.println();
        displayRec(a);
        System.out.println();
        displayRev(a);
    }

}
