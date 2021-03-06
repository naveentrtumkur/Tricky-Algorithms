/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//Iterative solution...
class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode prev = null;
        ListNode cur = head;
        while(cur!=null)
        {
            ListNode nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }
        return prev;
    }
}
