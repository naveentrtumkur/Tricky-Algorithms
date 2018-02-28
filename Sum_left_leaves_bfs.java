//Input for our program. Preorder input.

//[21,7,23,5,null,7,5,6,3,6,4,null,null]

// I have used a BFS approach to solve this problem.

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
    public int sumOfLeftLeaves(TreeNode root) {
        // I have taken a BFS approach to solve this problem.
        
        int res =0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode node = q.poll();
            if(node.left!=null && node.left.left == null && node.left.right == null)
                res+= node.left.val;
            
            if(node.left!=null)
                q.add(node.left);
            
            if(node.right!=null)
                q.add(node.right);
        }
        
        return res;
        
    }
}
