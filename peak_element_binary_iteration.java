class Solution {
    public int findPeakElement(int[] nums) {
        int mid;
        int low = 0, high = nums.length -1;
        while(low<high)
        {
            mid = (low + high)/2;
            if(nums[mid] > nums[mid+1])
                high = mid;
            else
                low = mid+1;
        }
        
        // if the llow value is equal to high return low index.
        return low;
    }
}
