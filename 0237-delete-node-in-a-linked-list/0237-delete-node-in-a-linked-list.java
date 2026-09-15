/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {

        // step 1: copy next node's value into this one
        node.val = node.next.val;
        // step 2: skip over the (now duplicate) next node
        node.next = node.next.next;
        
    }
}