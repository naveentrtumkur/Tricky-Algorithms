//Soln using extra space.

class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        // My first approach is to use a HashMap to add the elements as we encounter.
        // If an element already exists, increment the counter. The value portion holds the count of value.
        
        Map<Integer, Integer> map = new HashMap<>();
        int ret = -1;
        for(int i=0; i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
                map.put(nums[i],1);
            else
                map.put(nums[i], map.get(nums[i])+1);
        }
        
        // Using an iterator, find the key whose count is one & return that key.
        for( Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            int key = entry.getKey();
            int val = entry.getValue();
            if(val == 1)
                ret=key;
        }
        return ret;
    }
}
