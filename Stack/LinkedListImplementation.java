package Stack;

public class LinkedListImplementation {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }


    public static class Stack{
        private Node head=null;
        private int size=0;

        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }

        int pop(){
            int top=head.data;
            head=head.next;
            size--;
            return top;
        }

        int peek(){
            return head.data;
        }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }

        boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }

        boolean isFull(){
            return false;
        }
    }


    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(5);
        st.push(8);
        st.push(13);
        st.push(6);
        st.push(1);

        st.display();

        st.pop();
        st.display();

        System.out.println(st.peek());
        System.out.println(st.size());
    }

}
