// The input array is sorted and you need to return teh index whose
// sum would be equal to the target,

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diffs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            diffs.put(target-nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (diffs.containsKey(nums[i]) && i != diffs.get(nums[i])) {
                return new int[] {i+1, diffs.get(nums[i])+1};
            }
        }
        return new int[0];
    }
}


