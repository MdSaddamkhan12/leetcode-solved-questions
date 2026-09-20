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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Dummy node makes it easier to build the result linked list
        // without handling the first node separately.
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        // Stores the carry generated when the sum is 10 or more.
        int carry = 0;

        // Continue while either list has nodes or a carry is still left.
        while(l1 != null || l2 != null || carry != 0){

            int sum = 0;

            // Add the current value from l1 and move l1 to the next node.
            // If l1 is already null, we simply skip it.
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            // Add the current value from l2 and move l2 to the next node.
            // If l2 is already null, we simply skip it.
             if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            // Add the carry from the previous calculation.
            sum += carry;
            // Extract the carry for the next position.
            // Example: 15 → carry = 1
            carry = sum / 10;
            // Store only the digit at the current position.
            // Example: 15 → 5 is stored in the new node.
            ListNode node = new ListNode(sum % 10);
            // Attach the new node to the result list.
            current.next = node;
            // Move current forward so the next result node
            // can be attached after it.
            current = current.next;
        }
        // Dummy node itself is not part of the answer,
        // so return the actual first node of the result.
        return dummy.next;
        
    }
}