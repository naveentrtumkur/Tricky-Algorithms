class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        //Base case
        //if(nums == null || nums.length == 0)
         //   return false;
        int len = nums.length;
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i =0; i<len ; i++)
        {
            if(!set.contains(nums[i]))
                set.add(nums[i]);
            else
                return true;
        }
        //If the set doesn't contain any duplicate after parsing through all teh elements, return true.
        return false;
    }
}
