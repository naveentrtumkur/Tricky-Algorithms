/*****
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

***/

class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int sum=0, i=0,j=n-1;
        for(i=0;i<n;i++)
        {
        if(map.containsKey(nums[i]))
           map.remove(nums[i]);
           
          else
           map.put(nums[i],1);
           }
        Map.Entry<Integer,Integer> entry=map.entrySet().iterator().next();
 Integer key= entry.getKey();
 Integer value=entry.getValue();
           return key;
    }
}
  
