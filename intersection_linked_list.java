// To find the intersection of two linked lists using O(n) time and O(1) spavce complexity.
// approach -- I use two pointers for the lists: CurA and CurB, when one reaches head i will move it to other head.
// In second pass, if there is an intersection, the two pointers will match.

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
		if( null==headA || null==headB )
			return null;
		
		ListNode curA = headA, curB = headB;
		while( curA!=curB){
			curA = curA==null?headB:curA.next;
			curB = curB==null?headA:curB.next;
		}
		return curA; 
    }
}
