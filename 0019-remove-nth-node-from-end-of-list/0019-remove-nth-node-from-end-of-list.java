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

        // Dummy node handles the edge case of removing the head
        ListNode dummy = new ListNode(0, head);
        
        ListNode fast = dummy;
        ListNode slow = dummy;

         // Move fast by n + 1 steps to create the gap
        for(int i = 0; i <= n; i++){

            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while(fast != null){

            slow = slow.next;
            fast = fast.next;
        }

        // slow is now the node before the target, skip the target
        slow.next = slow.next.next;

        return dummy.next;
        
    }
}