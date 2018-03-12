class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        // Given the condition 1<=a[i]<=n, once u find an element , negate the value at index-1;
        // If u encounter that number again, u don't add that to the list.
        
        List<Integer> list = new ArrayList<>();
    
        
        for(int i=0;i<nums.length; i++)
        {
            int index = Math.abs(nums[i]);
            
            if(nums[index - 1] > 0)
                nums[index-1] = -nums[index-1];
            else
                list.add(Math.abs(nums[i]));
            
        }
        
        return list;
       
        
    }
}
