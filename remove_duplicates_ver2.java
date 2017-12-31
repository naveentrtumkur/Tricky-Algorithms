//If atmost 2 dulpicates are allowed, how many elements would be there.

class Solution {
    public int removeDuplicates(int[] nums) {
    int i = 0;
    for (int n : nums)
        if (i < 2 || n > nums[i-2])
            nums[i++] = n;
    return i;
}
}
