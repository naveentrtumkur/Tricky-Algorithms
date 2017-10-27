// Without using a new array you need to remove the elements of the array.
//In this problem we use a pointer to iterate through array.
//If the value is equal to nums[i], ignore that scenario.

class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0,n=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
             if(nums[i]!=val)
             {
                 nums[k] =nums[i];
                 k++;
             }
        }
        return k;
    }
}
 
