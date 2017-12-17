//Rotation of array using O(n) space complexity.

class Solution {
    public void rotate(int[] nums, int k) {
        int[] new_array = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            new_array[(i+k)%nums.length] = nums[i];
            
        }
        for(int i=0;i<nums.length;i++)
            nums[i] = new_array[i];
        
    }
}
