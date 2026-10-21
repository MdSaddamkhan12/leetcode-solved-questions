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

        // list is empty -> head = null, single node -> head.next = null
        if(head == null || head.next == null){

            return head;
        }

        ListNode newHead = reverseList(head.next);

        // 'front' points to the node immediately after 'head'
        ListNode front = head.next;
        // make front to point to head
        front.next = head;
        // make head point to null
        head.next = null;
        // return the reversed list
        return newHead;
        
    }
}