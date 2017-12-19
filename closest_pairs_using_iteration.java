// The goal of this piece of code is to find the closest value in a tree using a target value
// Iterative approach followed in this case.


public class solution
{
   public int closestvalue(TreeNode head, int target)
   {
	if(root == null)
	return null;
	
	int val = root.val;
	TreeNode node = head;

	// Calculate the current difference value
	int curDiff = Math.abs(target - root.val);

	while(node!=null)
	{
	int newDiff = Math.abs(target - node.val);
	if(newDiff <= curDiff)
	{
	curDiff = newDiff;
	val = node.val;
	}
	if(target < node.val)
	node = node.left;
	else
 	node = node.right;
	}

	return curDiff;
    }
}
