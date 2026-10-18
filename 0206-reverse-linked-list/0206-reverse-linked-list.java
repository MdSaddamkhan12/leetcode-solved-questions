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

            // Initialize prev as null because the last node of the reversed list must point to null.
            ListNode prev = null;

            // Temporary pointer to store the next node before reversing the current node's link.
            ListNode nextNode = null;

            // Start traversing the linked list from the head node.
            ListNode current = head;

            // Continue until all nodes have been processed.
            while (current != null) {

                // Save the next node so we don't lose the remaining linked list.
                nextNode = current.next;

                // Reverse the current node's pointer to point to the previous node.
                current.next = prev;

                // Move prev forward to the current node.
                prev = current;

                // Move current forward to the next node saved earlier.
                current = nextNode;
            }

            // Return prev, which now points to the new head of the reversed linked list.
            return prev;
    }
}