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
    public boolean hasCycle(ListNode head) {

    // slow moves one step at a time
    // fast moves two steps at a time
    ListNode slow = head;
    ListNode fast = head;

    // Continue while fast can move forward by two nodes
    // If fast reaches null, there is no cycle
    while (fast != null && fast.next != null) {

        // Move slow pointer by 1 step
        slow = slow.next;

        // Move fast pointer by 2 steps
        fast = fast.next.next;

        // If both pointers meet at the same node,
        // it means a cycle exists in the linked list
        if (slow == fast) {
            return true;
        }
    }

    // fast reached the end of the list,
    // so there is no cycle
    return false;
}
}