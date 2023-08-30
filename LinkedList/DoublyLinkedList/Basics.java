package LinkedList.DoublyLinkedList;

public class Basics {
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

    static void displayRev(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.prev;
        }
        System.out.println();
    }

    static void displayRandom(Node node){
        Node temp=node;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
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
        displayRev(e);
        displayRandom(d);
    }

}
