// To validate whether a given tree is a valid BST using the min-max approach.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return checkBST(root,null,null);
    }
    
    public boolean checkBST(TreeNode root, Integer min, Integer max)
    {
        // This is the base condition which must match.
        if(root == null)
            return true;
        
        //This is the case where there is mismatch of min and max values in the subtrees.
        if((min!=null && root.val <= min) || (max!=null && root.val >= max))
            return false;
        
        // When we iterate through left and right subtrees, this condition should be met.
        if(!checkBST(root.left,min,root.val) || !checkBST(root.right,root.val,max))
            return false;
        
        // If all the above conditions holds good, then return true.
        return true;
    }
}
