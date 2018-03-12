// Write a program to find all teh duplicates in an array.

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        // My approach is to use a HashMap to store teh frequency of all teh elements.
        // Then iterate through the hashMap to get a list of values which occur only once.
        
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int num:nums)
        {
            if(!map.containsKey(num))
                map.put(num,1);
            else
                map.put(num, map.get(num)+1);
        }
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            Integer key = entry.getKey();
            Integer val = entry.getValue();
            
            if(val != 1)
                list.add(key);
        }
        return list;
        
    }
}
