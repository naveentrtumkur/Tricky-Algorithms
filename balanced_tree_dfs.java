/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// I am using a DFS approach to solve this particular problem.

class Solution {
    public boolean isBalanced(TreeNode root) {
        return dfs(root) != -1;
             
    }
    
    public int dfs(TreeNode root)
    {
        if(root == null)
            return 0;
        
        int leftVal = dfs(root.left);
        if(leftVal == -1)
            return -1;
        int rightVal = dfs(root.right);
        if(rightVal == -1 )
            return -1;
        
        if(Math.abs(leftVal - rightVal) > 1)
            return -1;
        
        return 1 + Math.max(leftVal,rightVal); // else for all other cases.
        
            
    }
}
