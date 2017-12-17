class Solution {
    public int removeDuplicates(int[] nums) {
        // This is a solution using two pointers. O(1) space complexity and worst case of O(n) time complexity.
        int i=0,j;
        for(j=1;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i] = nums[j];
            }
            
        }
            return i+1;//Since it is index, to return the count we need to return i+1;
    }
}
