/****
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.


Example:

Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5

***/

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
    public TreeNode sortedArrayToBST(int[] nums) {
        //Null check for nums array.
        if(nums == null)
            return null;
        
        // Construct a root node by using a helper function.
        TreeNode root = helper(nums,0,nums.length-1);
        return root;
        /*int len = nums.length;
        int low = 0, high = len-1,mid =0;*/
        
    }
    public TreeNode helper(int[] nums, int low, int high)
    {
        if(low>high)
            return null; // Condition to check so that we stop at this step.
        
        int mid = (low + high)/2;
        TreeNode head = new TreeNode(nums[mid]) ;
        //head.val = nums[mid];
        head.left = helper(nums,low,mid-1);
        head.right = helper(nums,mid+1,high);
        //we need to return teh value of head.
        return head;
    }
}
