// Determine if there is a cycle in alinked list.
//Return true if there's a cycle, else return false.

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
   public boolean hasCycle(ListNode head) {
    HashSet<ListNode> nodesvisit = new HashSet<>();
    while (head != null) {
        if (nodesvisit.contains(head)) {
            return true;
        } else {
            nodesvisit.add(head);
        }
        head = head.next;
    }
    return false;
}

}
