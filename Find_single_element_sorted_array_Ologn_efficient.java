// Binary search approach.
// O(logn) efficient approach.

class Solution {
    public int singleNonDuplicate(int[] nums) {
        
       // My alternate approach is to use Binary Search to solve & find the single element in O(logn) complexity.
        int n = nums.length;
        int low =0, high = nums.length-1;
        int mid =0;
        //traverse untill low<high
        while(low<high)
        {
            //Calculate the mid value.
             mid = (low+high)/2;
            
            //mid should be in even position so that it's easy for comparison. If it's at odd positio, shift one position back.
            if(mid%2 == 1)
                mid--;
            
            // If teh two elements aren't equal then, single element is at left part.
            // Shift the left index. 
            if(nums[mid] != nums[mid+1])
             high = mid;
            // Else shift the low position to mid+2 and iterate through teh array.
            else
                low = mid+2;
        }
        //Finally return teh nums[low], low would be index of single elemnt.
        return nums[low];
    }
}
