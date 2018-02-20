class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length, diff;
        
        // Create a HashMap to store value and index in HashMap.
        HashMap<Integer,Integer> set = new HashMap<Integer,Integer>();
        for( int i=0; i<len ; i++)
        {
            if(!set.containsKey(nums[i]))
                set.put(nums[i],i);
            else
            {
                if(Math.abs(i - set.get(nums[i])) <=k)
                    return true;
                else
                    // Or else update the set with the new index value.
                    set.put(nums[i],i);
            }
            
        }
        return false;
        
        
        
    }
}
