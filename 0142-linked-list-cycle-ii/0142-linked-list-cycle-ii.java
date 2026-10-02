/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
public ListNode detectCycle(ListNode head) {

    // Initialize two pointers:
    // slow moves one step at a time
    // fast moves two steps at a time
    ListNode slow = head;
    ListNode fast = head;

    // Continue while fast can safely move two steps
    while (fast != null && fast.next != null) {

        // Move slow by 1 step
        slow = slow.next;

        // Move fast by 2 steps
        fast = fast.next.next;

        // If slow and fast meet, a cycle exists
        if (slow == fast) {

            // Reset slow to the head.
            // Keep fast at the meeting point.
            // From here, both pointers will reach
            // the start of the cycle at the same time.
            slow = head;

            // Move both pointers one step at a time
            // until they meet again.
            // The meeting node is the start of the cycle.
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }

            // Return the first node of the cycle
            return slow;
        }
    }

    // If fast reaches null, there is no cycle
    return null;
}
}