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
    public boolean isPalindrome(ListNode head) {

        // Phase 1: Find the middle of linked list

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
        }

        // Phase 2: reverse the 2nd half of linked List
        ListNode prev = null;
        ListNode current = slow;

        while(current != null){

            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        // Phase 3: compare the values using two pointer approach
        ListNode left = head;
        ListNode right = prev;
        while(right != null){

            // If corresponding values are different, not a palindrome
            if(left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
        
    }
}