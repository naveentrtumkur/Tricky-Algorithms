/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// I am using a BFS approach to solve this particular problem.
// In order to solve this problem, Ill compute the sum at each level and take the average value and append it the ArrayList.
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        q.add(root);
        
        while(!q.isEmpty())
        {
            Double avg = 0.0;
            int len = q.size();
            for(int i=0;i<len;i++)
            {
            TreeNode node = q.remove();
                avg += node.val;
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
                
            }
            //System.out.println(avg);
            list.add(avg/len);
        }
        
        return list;
        
    }
}
