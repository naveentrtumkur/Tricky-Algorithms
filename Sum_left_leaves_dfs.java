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
    boolean leftSide = false, rightSide = false;
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return sum;
        
    // I am using a DFS approach to recursively traverse the right side and then traverse the right side.
       // Recursively iterate through the left side of tree.
       if(root.left!=null)
       {
           leftSide = true;
           rightSide = false;
           sumOfLeftLeaves(root.left);
           
       }
        
        // Calculate the sum when we encounter left leaves.
        if(root.left == null && root.right == null && leftSide && (!rightSide))
            sum += root.val;
        
        // Recursively iterate through the right BST.
        if(root.right!=null)
        {
            leftSide = false;
            rightSide = true;
            sumOfLeftLeaves(root.right);
        }
        return sum;
        
    }
}
// This solution is moreover like an inorder traversal of the tree.
