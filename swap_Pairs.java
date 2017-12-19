// Swap pairs of nodes in a linked list using recursion.

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
        
        ListNode n = head.next;
        head.next = swapPairs(head.next.next); // You can use n.next also. This works fine in this case.
        n.next = head;
        return n;
    }
}
