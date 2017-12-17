// This is an efficient solution to rotating the array.
// we can use the reversing concept to get to our results.

class Solution {
    public void rotate(int[] nums, int k) {
        //This algorithm uses the concept of reversing teh array, reversing first k-bits and next n-k bits to achieve the result.
        int n = nums.length;
        k = k % n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        // We would have computed the required rotation using this method.
    }
    
    public void reverse(int[] nums, int start, int end )
    {
        // reverse the contents starting from beginning till the end.
        while(start<end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
            //since this is a void function, no need to return anything back.
        }
    }
}
