Reverse a singly linked list.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//Recursive solution...
class Solution {
    public ListNode reverseList(ListNode head) {
       if(head == null || head.next == null)
           return head;
        ListNode p = reverseList(head.next);
        
        head.next.next = head;
        head.next = null;
        
        return p;
    }
}
