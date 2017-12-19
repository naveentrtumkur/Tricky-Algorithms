//Iterative approach to solve if the tree is symmeteric using Queue
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
        
        // Using queue to solve whether a tree is symmetric. similar to a BFS approach.
        
        Queue<TreeNode> q = new LinkedList<>();
        //first add root node to the queue, two times.
        q.add(root);
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode t1 = q.remove();
            TreeNode t2 = q.remove();
            if(t1==null && t2 == null)
                continue;
            if(t1==null || t2 == null)
                return false;
            if(t1.val==t2.val)
            {
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
            }
            else 
                return false;
        }
        return true;
    
    }
}
