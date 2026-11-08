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
    public ListNode swapPairs(ListNode head) {

        // Create a dummy node to handle swapping easily, including the head node
        ListNode dummy = new ListNode(0);

        // Connect the dummy node to the original head
        dummy.next = head;

        // Use point to track the node before the pair being swapped
        ListNode point = dummy;


        while(point.next != null && point.next.next != null){

            // Store the first node of the pair
            ListNode swap1 = point.next;
            // Store the 2nd node of the pair
            ListNode swap2 = point.next.next;

            // Connect the first node to the node after the second node
            swap1.next = swap2.next;
            // Connect the second node to the first node (reverse their order)
            swap2.next = swap1;

            // Connect the previous node to the second node (complete the swap)
            point.next = swap2;
            // Move point to swap1, which is now the last node of the swapped pair
            point = swap1;

        }

        // Return the updated head, skipping the dummy node
        return dummy.next;
        
    }
}