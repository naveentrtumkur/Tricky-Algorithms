// Iterative solution top solve swap pairs of linked list nodes 
// using O(1) space complexity and return appropriate values.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        ListNode cur = head;
        ListNode newhead = head.next;
        while(cur!=null && cur.next!=null)
        {
            ListNode temp = cur;
            cur = cur.next;
            temp.next = cur.next;
            cur.next = temp;
            cur = temp.next;
            if(cur!=null && cur.next!=null)
                temp.next = cur.next; // If there are more nodes, this pointing should be taken care of.
        }
        return newhead;
        
    }
}
