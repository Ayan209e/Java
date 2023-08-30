package LinkedList;

public class nthNodeFromLast {
    public class Node {
        int data;
        Node next;
        Node(int x){
            data = x;
        }
    }

//  To display nth node from last
    public static Node nthNode(Node head,int n){
        Node fast=head;
        Node slow=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }

//  To delete nth node from last
//  Leetcode 19
    public Node removeNthFromEnd(Node head, int n) {
        Node fast=head;
        Node slow=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
