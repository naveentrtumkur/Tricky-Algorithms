// This code snippet deletes duplicates from a sorted linkedlist.
/*
Given a sorted linked list, delete all the duplicates such that element appears only once.

1->1->2 is equal to 1->2
1->1->2->2->3 is equal to 1->2->3

*/

/* Definition of singly linked list

Public Class ListNode {
 int val;
 ListNode next;
 ListNode(int x)
 {
  val = x;
 }
}
***/


Class Solution
{
    public ListNode deleteduplicates(ListNode head)
    {
        ListNode cur = head;
        if(head == null || head.next == null)
	    return head;
	ListNode prev = cur;
	cur = prev.next;
	while(cur!=null)
	{
	    if(cur.val == prev.val)
	    { 
		prev.next = val;
		cur = cur.next;
	    }
	    else
	    {
		prev.next = cur;
		prev = cur;
		cur = cur.next;
	    }
	}

	return head;
}
}
