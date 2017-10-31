/******
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Credits:
Special thanks to @ts for adding this problem and creating all test cases.

****/

import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(nums[i]))
                map.put(nums[i],1);
            else
                map.put(nums[i],(map.get(nums[i]))+1);
        }
        int max = -999,maxval = -999;
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            int key = entry.getKey();
            int value = entry.getValue();
            if(maxval < value)
            {
                max = key;
                maxval = value;
            }
        }
        
        return max;
    }
}
