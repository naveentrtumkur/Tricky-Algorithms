//Given a binary tree, find the leftmost value in the last row of the tree.

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
    public int findBottomLeftValue(TreeNode root) {
        // Use a BFS approach to solve this problem. If the queue is empty, return left.
        // Else BFS traverse the remaining part.
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int left = root.val;
        while(!q.isEmpty())
        {
            int size = q.size();
            for (int i=0;i<size;i++)
            {
                // Remove the node from teh queue.
                TreeNode temp = q.poll();
                if(i==0){
                // This would be the leftmost node, hence assign this to left.
                left = temp.val;
                }
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
            }
        }
        
        return left;
        
    }
}
