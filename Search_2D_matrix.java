// Search a 2D matrix. Binary search approach.

// Apply binary search for the rows, then based on appropriate value got,
// Apply binary search within a particular row. Return the result.

class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            //This would be the base condition for our solution.
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
                return false;
            int m = matrix.length, n = matrix[0].length;
            int low = 0, high = m - 1;
            while (low <= high) {
                int mid = (low + (high))/2;
                if (target > matrix[mid][n - 1])
                    low = mid + 1;
                else if (target < matrix[mid][n - 1])
                    high = mid - 1;
                else 
                    return true;
            }
            // If the row value wasn't found then return false. Given that the rows
            // are properly sorted in ascending order.
            if (low >= m ) 
                return false;
            int row = low;
            low = 0;
            high = n - 1;
            while (low <= high) {
                int mid = (low + (high))/2;
                
                if (target > matrix[row][mid]) {
                    low = mid + 1;
                } else if (target < matrix[row][mid]) {
                    high = mid - 1;
                } else {
                    return true;
                }
            }
            return false;
        }
    } //End of the program.
