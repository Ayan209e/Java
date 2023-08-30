package LinkedList;

public class SplitOddEvenLL {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode oddEvenList(ListNode head) {
        ListNode es=null, ee=null; //Even start, even end
        ListNode os=null, oe=null; // odd start, odd end
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            if(count%2==0){
                if(es==null){
                    es=ee=temp;
                }
                else{
                    ee.next=temp;
                    ee=ee.next;
                }
            }
            else{
                if(os==null){
                    os=oe=temp;
                }
                else{
                    oe.next=temp;
                    oe=oe.next;
                }
            }
            temp=temp.next;
        }
        if(os==null || es==null)return head;
        oe.next=es;
        ee.next=null;
        return os;
    }
}
