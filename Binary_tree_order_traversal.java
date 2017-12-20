// I am using a BFS approach in order to tackle this particular problem.
// Making use of a queue to store th evalues and returning the list of numbers stored in a LinkedList.
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List result = new ArrayList();
        if(root==null)
            return result;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty())
        {
            ArrayList<Integer> level = new ArrayList<Integer>();
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode cur = q.remove();
                level.add(cur.val);
                if(cur.left!=null)
                    q.add(cur.left);
                if(cur.right!=null)
                    q.add(cur.right);
            }
            result.add(0,level);
        }
        return result;
    }
}
