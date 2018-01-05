// My approach uses the given data of sorted values, and will search by utilizing the following two strategies:-

/* 1) If current value is less than target == column++
   2) If current value is greater than target == row--
   3) if the current value is equal to target, then return the value.
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // start a ptr at the bottom-left
        int row = matrix.length-1;
        int col = 0;

        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] > target) {
                row--;
            } else if (matrix[row][col] < target) {
                col++;
            } else { // found teh result value
                return true;
            }
        }

        return false;
    }
}
