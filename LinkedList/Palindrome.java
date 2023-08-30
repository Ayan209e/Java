package LinkedList;

public class Palindrome {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode reverse(ListNode head){
        ListNode curr=head,prev=null,agla=null;
        while(curr!=null){
            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;
        }
        return prev;
    }


    public boolean isPalindrome(ListNode head) {
        ListNode s=head,f=head;
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode temp=reverse(s.next);
        s.next=temp;
        ListNode p1=head,p2=s.next;
        while(p2!=null){
            if(p1.val!=p2.val)return false;
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }
}
