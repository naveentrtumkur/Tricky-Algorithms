//Implmentation of finding maximum subarray using big-O of 1 space and O(n) time complexity.

// Using DP to find the maximum subarray in O(n) time complexity and O(1) space complexity.

class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        int result = Integer.MIN_VALUE;
        int max = nums[0];
        for(int i=0 ;i <nums.length;i++)
        {
            result = Math.max(0,result) + nums[i];
            max = Math.max(max,result);
        }
        return max;
        
    }
}
