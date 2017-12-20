/*****
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
*****/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3)
            return result;
        Arrays.sort(nums);
        int i=0;
        int j,k;
        while(i<nums.length-2)
        {
           // while(j<k)
            //{
            //int sum;
            if(nums[i]>0)
                break;
            j=i+1;
            k = nums.length -1;
            while(j<k)
            {
            int sum = nums[i] + nums[j] + nums[k];
            if(sum==0 && j<k)
                result.add(Arrays.asList(nums[i],nums[j],nums[k]));
            if(sum <= 0 && j<k)
                while(nums[j] == nums[++j] && j < k);
            if(sum>0 && j<k)
                while(nums[k] == nums[--k] && j <k);
            //}
        }
            while(nums[i] == nums[++i] && i < nums.length -2);
        }
        return result;
        
    }
}
