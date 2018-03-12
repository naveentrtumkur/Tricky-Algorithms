/*

Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:

The root is the maximum number in the array.
The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
Construct the maximum tree by the given array and output the root node of this tree.

*/


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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
       return conSubtree(nums, 0, nums.length);
        }
        
        // This is a function to construct subtree from the array passed.
        public TreeNode conSubtree(int[] nums, int l, int r)
        {
            if( l == r)
                return null;
            
            int maxIndex = findMax(nums,l,r);
            
            TreeNode root = new TreeNode(nums[maxIndex]);
            root.left = (conSubtree(nums,l,maxIndex));
            root.right = conSubtree(nums,maxIndex+1,r);
            
            return root;
        }
    
        // This is the function used to find the max index.
        public int findMax(int[] nums, int l, int r)
        {
            int maxIndex = l;
            for(int i=l; i<r;i++)
            {
                if(nums[maxIndex] < nums[i])
                    maxIndex = i;
            }
            return maxIndex;
        }
    }
//}
