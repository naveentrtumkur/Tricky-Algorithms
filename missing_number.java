//To find the missing number in an array of numbers.

class Solution
{
public int missingNum(int[] nums)
{
 int sum=0;
 for(int num:nums)
 {
  sum += num;
 }
 return (nums.length + nums.length+1)/2 - sum;
}
}
 
