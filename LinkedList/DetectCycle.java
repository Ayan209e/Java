package LinkedList;

public class DetectCycle {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Leetcode 141
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)return true;
        }
        return false;
    }

//  Leetcode 142
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head,fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        if (fast == null || fast.next == null) return null;

        ListNode temp=head;
        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;
        }
        return slow;
    }
}
