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

         // Dummy node simplifies edge case of removing head
        ListNode dummy = new ListNode(0, head);

        // First pass: count/length total nodes
        int length = 0;
        ListNode current = head;
        while(current != null){
            length++;
            current = current.next;
        }

        // Second pass: advance (length - n)-> 5-2 = 3 steps from dummy
        ListNode prev = dummy;
        for(int i = 0; i < length - n; i++){

            prev = prev.next;
        }

        // Remove the target node
        prev.next = prev.next.next;

        return dummy.next;
        
    }
}