Date:22.03.25
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // initialising the pointer
        // 1. start that will point head
        // 2. Fast and slow pointers starting form start

        ListNode start = new ListNode();
        start.next = head; // this means start is not head but its next node is head
        ListNode slow = start;
        ListNode fast = start;

        // fast needs to reach nth node
        for(int i=0; i<=n; i++){
            fast = fast.next;
        }

        // now once fast reaches n we need to start with sow pointer
        // before that we need to check for edge case that whether fast is laready null or not
        // if it is that means we need to remove the head

        if(fast==null){
            // changing head
            return head.next;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
}
