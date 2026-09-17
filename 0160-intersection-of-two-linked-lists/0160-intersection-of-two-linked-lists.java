/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode pA = headA;
        ListNode pB = headB;
        
        // Traverse both lists, when one reaches the end, redirect it to the head of the other list
        while( pA != pB){

            // When pA reaches to end , point it to the headB
            pA = (pA == null) ? headB : pA.next;
            // When pB reaches to end , point it to the headA
            pB = (pB == null) ? headA : pB.next;
        }
        return pA;
        
    }
}