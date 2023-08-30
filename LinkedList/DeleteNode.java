package LinkedList;
// Leetcode 237. Delete node given the node itself;
public class DeleteNode {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
        public void deleteNode(ListNode node) {
            node.val=node.next.val;
            node.next=node.next.next;
        }
}
