// I have used iterative approach to solve this problem.
// iteratively solve for each node and merge the lists accordingly.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       ListNode prev = new ListNode(-1);
        ListNode current = prev;
        while(l1!=null && l2!=null)
        {
            if(l1.val < l2.val)
            {
                current.next = l1;
                l1 = l1.next;
                //prev = current;
                
            }
            else
            {
                current.next = l2;
                l2 = l2.next;
                //prev = current;
            }
            
            //Increment the current pointer to next location.
            current = current.next;
        }
        current.next = l1==null?l2:l1;
        return prev.next;
 
        
    }
}
