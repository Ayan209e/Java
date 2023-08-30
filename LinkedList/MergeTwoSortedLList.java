package LinkedList;
// Leetcode 21
public class MergeTwoSortedLList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

//    O(n) Space (New LinkedList)
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode head=new ListNode(100);
        ListNode temp=head;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                ListNode node=new ListNode(temp1.val);
                temp.next=node;
                temp=temp.next;
                temp1=temp1.next;
            }
            else{
                ListNode node=new ListNode(temp2.val);
                temp.next=node;
                temp=temp.next;
                temp2=temp2.next;
            }
        }
        while(temp1!=null){
            ListNode node=new ListNode(temp1.val);
            temp.next=node;
            temp=temp.next;
            temp1=temp1.next;
        }
        while(temp2!=null){
            ListNode node=new ListNode(temp2.val);
            temp.next=node;
            temp=temp.next;
            temp2=temp2.next;
        }
        head=head.next;
        return head;
    }


//    O(1) Space (In place)
    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode head=new ListNode(100);
        ListNode temp=head;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                temp.next=temp1;
                temp=temp1;
                temp1=temp1.next;
            }
            else{
                temp.next=temp2;
                temp=temp2;
                temp2=temp2.next;
            }
        }
        while(temp1!=null){
            temp.next=temp1;
            temp=temp1;
            temp1=temp1.next;
        }
        while(temp2!=null){
            temp.next=temp2;
            temp=temp2;
            temp2=temp2.next;
        }
        head=head.next;
        return head;
    }
}
