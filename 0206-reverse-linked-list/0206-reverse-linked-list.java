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

        ListNode current = head;
        Stack<Integer> stack = new Stack<>();


        // Push all node values onto the stack
        while(current != null){

            stack.push(current.val);
            current = current.next;
        }

        current = head;

        // Pop values and update the nodes in reverse order
        while(current != null){

            current.val = stack.pop();
            current = current.next;
        }
        return head;
        
        
    }
}