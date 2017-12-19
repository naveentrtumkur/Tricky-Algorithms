//Using recursive approach to solve if the tree is symmeteric
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
    public boolean isSymmetric(TreeNode root) {
       return isSame(root,root);
    }
    
    public boolean isSame(TreeNode t1, TreeNode t2)
    {
        if(t1 == null && t2 == null)
            return true;
        if(t1 == null || t2 == null)
            return false;
       
        return (t1.val == t2.val) && isSame(t1.left,t2.right) && isSame(t1.right,t2.left);
        // Checks if the left and right subtrees are symmetric
         
        
    }
}
