/**************

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.

*************/

class Solution {
    public void moveZeroes(int[] nums) {
        int numZeroes =0;
        int temp=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                numZeroes++;
            else
            {
                nums[i-numZeroes] = nums[i];
            }
        }
        int j=nums.length-1;
        for(int i=0;i<numZeroes;i++)
        {
            nums[j] = 0;
            j--;
        }
        
    }
}
