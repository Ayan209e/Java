package LinkedList;

public class IntersectionNode {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public int length(ListNode head){
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        return c;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n=length(headA);
        int m=length(headB);
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(n>m){
            temp1=temp1.next;
            n--;
        }
        while(m>n){
            temp2=temp2.next;
            m--;
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}
