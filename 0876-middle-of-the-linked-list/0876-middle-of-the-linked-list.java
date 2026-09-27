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
    public ListNode middleNode(ListNode head) {

        ListNode current = head;

        // 1st Pass: find the length of LL
        int count = 0;
        while(current != null){

            count++;
            current = current.next;
        }

        // 2nd Pass: find the middle Node
        current = head;
        for(int i = 0; i < count/2; i++){

            current = current.next;
        }
        return current;
        
    }
}