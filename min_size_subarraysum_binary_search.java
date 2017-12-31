//Binary search approach to minimum sum subarray.

class Solution {
   public int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n;
        int min = 0;
        while(left <= right){
            int mid = (left + right)/2;
            if (maxSumSubArrayLen(mid, nums) >= s){
                min = mid;
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
        return min;
    }
    
    public int maxSumSubArrayLen(int len, int[] nums){
        int max = 0;
        int sum = 0;
        for (int i = 0; i < len; ++i){
            sum += nums[i];
        }
        
        max = sum;
        
        for (int i = len; i < nums.length; ++i){
            sum = sum + nums[i] - nums[i-len];
            if (max < sum){
                max = sum;
            }
        }
        
        return max;
    }
    }
