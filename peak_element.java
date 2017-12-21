//Finding the peak element using iterative approach.

class Solution {
    public int findPeakElement(int[] nums) {
        int mid;
        //if(nums.length==1)
        //    return 0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i] > nums[i+1])
                return i;
        }
        return nums.length-1;
        
    }
}
