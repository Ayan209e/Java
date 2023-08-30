package LinkedList;

public class MiddleNode {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Leetcode 876
    public ListNode middleNode(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast.next!=null){
            slow=slow.next;
        }
        return slow;
    }

//    Leetcode 2095
    public ListNode deleteMiddle(ListNode head) {
        if(head==null)return head;
        if(head.next==null)return null;
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next.next!=null && fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
