//Closest pair probelm using recursion and using java.
// Aim: To return the closest value to a given value of node in a tree.

public class solution
{
    public int closestvalue(TreeNode root, int target)
    {
	if(root == null)
	return 0;
	
	int closest = root.val;
	int currentDiff = Math.abs(target - root.val);
	
	//If the current difference is greater than the current node value, move to the right side
	if(target > root.val && root.right!=null)
	 closest = closestvalue(root.right, target);

	//If the current difference value is less than the current node value, move to the left side
	if(target < root.val && root.left!=null)
	 closest = closestvalue(root.left, target);

	// Now calculate the new difference value and check if it's better than the previous difference value.
	int newDiff = Math.abs(target - closest);

	if(newDiff < currentDiff)
	return closest;

	//Else we have to return the default root value.

	return root.val
    }
}
	  
