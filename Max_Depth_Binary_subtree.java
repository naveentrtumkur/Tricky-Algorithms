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
     //int maxLen =1, highest = 1;
    public int maxDepth(TreeNode root) {
        
        if(root == null)
            return 0;
       
        return 1+ Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
