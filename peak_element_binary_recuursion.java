//Find the peak element using recursion.

class Solution {
    public int findPeakElement(int[] nums) {
        return findpeakelem(nums,0,nums.length-1);
        
    }
    
    public int findpeakelem(int[] nums, int low, int high)
    {
        int mid;
        if(low == high)
            return low;
        mid= (low+high)/2;
        if(nums[mid] > nums[mid+1])
            return findpeakelem(nums,low,mid);
        else
            return findpeakelem(nums,mid+1,high);
    }
}
