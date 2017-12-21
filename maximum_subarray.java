//To find teh maximum subarray using dynamic programming.

class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        int max = nums[0];
        dp[0] = nums[0];
        for(int i=1;i<nums.length;i++)
        {
          dp[i] = Math.max(dp[i-1] + nums[i],nums[i] );
           // System.out.println(dp[i]);
          max = Math.max(dp[i],max);
            //System.out.println(max);
        }
        return max;
        
    }
}
