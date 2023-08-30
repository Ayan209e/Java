package LinkedList;

public class Implementation {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static class linkedlist{
        Node head=null;
        Node tail=null;
        int size=0;

        void insertAtEnd(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }
        void insertAtEndUsingHead(int data){
            Node temp=new Node(data);
            Node t=head;
            while(t.next!=null){
                t=t.next;
            }
            t.next=temp;
        }

        void insertAtHead(int data){
            Node temp=new Node(data);
            if(head==null){
                head=tail=temp;
            }
            else {
                temp.next=head;
                head=temp;
            }
            size++;
        }

        void insertAt(int idx,int data){
            Node temp=new Node(data);
            Node t=head;
            if(idx==0){
                insertAtHead(data);
                return;
            }
            else if(idx==size){
                insertAtEnd(data);
                return;
            }
            else if(idx<0 || idx>size){
                System.out.println("Invalid Index");
                return;
            }

            for(int i=1;i<idx;i++){
                t=t.next;
            }
            temp.next=t.next;
            t.next=temp;
            size++;
        }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
            System.out.println();
        }

//        int size(){
//            int count=0;
//            Node temp=head;
//            while(temp!=null){
//                count++;
//                temp=temp.next;
//            }
//            return count;
//        }

        int getAt(int idx){
            if(idx<0 || idx>size){
                System.out.println("Invalid Index");
                return -1;
            }
            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }

        void deleteAt(int idx){
            Node temp=head;
            if(idx==0){
                head=head.next;
                size--;
                return;
            }
            for(int i=1;i<idx;i++){
                temp=temp.next;
            }
            temp.next = temp.next.next;
            if(idx==size){
                tail=temp.next;
            }
            size--;
        }




    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(3);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(8);
        ll.insertAtEnd(10);
//        ll.display();
//        System.out.println(ll.size());
        ll.insertAtHead(12);
        ll.insertAt(2,18);
        ll.display();
        System.out.println(ll.getAt(3));
        ll.deleteAt(2);
        ll.display();
    }
}
