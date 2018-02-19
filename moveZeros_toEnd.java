// Write a function to move all the zeros to th eend.
// Avoid using extra operations.
// You can also swap the zeros with end elements.(If the order doesn't matter).
// the below proposed soluution would be an efficient solution.

class Solution {
   public void moveZeroes(int[] nums) {
    int leftMostZeroIndex = 0; // The index of the leftmost zero
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            if (i > leftMostZeroIndex) { // There are zero(s) on the left side of the current non-zero number, swap!
                nums[leftMostZeroIndex] = nums[i];
                nums[i] = 0;
            }

            leftMostZeroIndex++;
        }
    }
}
}
