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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        // Create a dummy node before the original head.
        // This handles the case where left = 1.
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Start from the dummy node.
        // We need to reach the node immediately before position left.
        ListNode leftPrev = dummy;

        for(int i = 0; i < left - 1; i++){

            leftPrev = leftPrev.next;

        }

        // current points to the first node that must be reversed.
        ListNode current = leftPrev.next;

        // prev represents the previous node during reversal. 
        // Initially, there is no previous node inside the section.
        ListNode prevNode = null;

        // Reverse exactly (right - left + 1) nodes.
        for(int i = 0; i < right - left + 1; i++){

            // Save the next node before changing the current link.
            ListNode nextNode = current.next;

            // Reverse the link between current and its next node.
            current.next = prevNode;

            // Move prev forward to the current node.
            prevNode = current;

            // Move current forward using the saved next node.
            current = nextNode;
        }

        // Connect the original starting node, which is now the tail,
        // to the node immediately after the reversed section.
        leftPrev.next.next = current;

        // Connect the node before the section to its new head.
        leftPrev.next = prevNode;
        // Return the actual head, skipping the dummy node.
        return dummy.next; 

        
    }
}