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
    public boolean isBalanced(TreeNode root) {
        if(root == null )
            return true;
        
        int leftHeight = helper(root.left);
        int rightHeight = helper(root.right);
         return (Math.abs(leftHeight-rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right));
           //  return true;
        
        //return false;
             
    }
    
    public int helper(TreeNode root)
    {
        if(root == null) return 0;
        return 1 + Math.max(helper(root.left),helper(root.right));
    }
}
