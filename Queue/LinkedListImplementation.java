package Queue;

public class LinkedListImplementation {
    public static class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
        }
    }
    public static class QueueLL{
        Node head=null;
        Node tail=null;
        int size=0;

        public void add(int val){
            Node temp=new Node(val);
            if(size==0){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }

        public int remove(){
            if(size==0){
                System.out.println("Queue Is Empty");
                return -1;
            }
            int x=head.data;
            head=head.next;
            size--;
            return x;
        }

        public int peek(){
            if(size==0){
                System.out.println("Queue Is Empty");
                return -1;
            }
            return head.data;
        }

        public int size(){
            return size;
        }

        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
            System.out.println();
        }

        public boolean isEmpty() {
            if (size == 0) return true;
            return false;
        }
    }


    public static void main(String[] args) {
        QueueLL q=new QueueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
    }
}
