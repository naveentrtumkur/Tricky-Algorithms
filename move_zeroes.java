//Move zeroes to the end of the array using java.

/***
Inspired by your code, my implementation doesn’t use a temp variable and avoids unnecessary swaps when nums has leading non-zero element.

Idea - Set leftMostZeroIndex to 0. Iterate through the array, at each iteration i, if nums[i] != 0 and i > leftMostZeroIndex, replace the leftmost zero element nums[leftMostZeroIndex] with nums[i], and set nums[i] to 0.

Note that i >= leftMostZeroIndex is always true, and i == leftMostZeroIndex happens when nums has leading non-zero elements, e.g., nums = {2, 1, 3, 0, 5, 0, 6}. In such a case, we don’t perform any swap, and keep incrementing i and leftMostZeroIndex until i > leftMostZeroIndex.
**/

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
