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

        Set<ListNode> seen = new HashSet<>();
        ListNode current = headA;

         // Store all nodes from list A in a set
        while(current != null){

            seen.add(current);
            current = current.next;
        }

        current = headB;
        // Walk through list B and find the first shared node
        while(current != null){

            if(seen.contains(current)){
                
                return current;
            }
            current = current.next;
        }
        return null;
        
    }
}