// Write a program to find the tilt of a binary tree.

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
    int sum =0;
    public int findTilt(TreeNode root) {
       
        helper(root);
        return sum;
        
    }
        
    public int helper(TreeNode root)
    {
         if(root == null)
            return 0;
        
        int leftVal = helper(root.left);
        int rightVal = helper(root.right);
        
        int absDiff = Math.abs(leftVal-rightVal);
        sum += absDiff;
        return  leftVal + rightVal + root.val;
       // return Math.abs( - ) + findTilt(root.left) + findTilt(root.right);
        
    }
}
