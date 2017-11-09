/****************
// Approach-2 ..... You need to find min1, min2 and max1,max2 and max3 to compute the maximum product. Thi scan be solved without sorting the array.


Given an integer array, find three numbers whose product is maximum and output the maximum product.

Example 1:
Input: [1,2,3]
Output: 6
Example 2:
Input: [1,2,3,4]
Output: 24
Note:
The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.

*********************/

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        
        int n= nums.length, sum=1 ;
        int i=0 ,j =n-1;
        /*if(nums[n-1] >0)
            sum=sum*nums[j--];
            else
                sum=sum*nums[i++];
        
        if(nums[n-2] >0)
            sum=sum*nums[j--];
            else
                sum*=nums[i++];
        
        if(nums[n-3] >0)
            sum*=nums[j--];
        else
            sum*=nums[i++];
         
        return sum;
        */
        
        return Math.max(nums[0]*nums[1]*nums[n-1], nums[n-1]*nums[n-2]*nums[n-3]);
    }
}
