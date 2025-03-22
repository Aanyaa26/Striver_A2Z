Date: 22.03.25
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
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;   // To store the previous node
        ListNode current = head;    // To traverse the linked list
        ListNode next = null;       // To temporarily store the next node

        // Iterate over the linked list
        while (current != null) {
            next = current.next;    // Store the next node
            current.next = previous; // Reverse the current node's pointer
            previous = current;     // Move previous to this node
            current = next;         // Move current to the next node
        }

        // After the loop, previous will be the new head of the reversed list
        return previous;    
    }
}
