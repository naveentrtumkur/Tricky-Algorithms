// To rotate an image.

class Solution {
    public void rotate(int[][] matrix) {
        // Initial start and end values are obtained.
        int start = 0;
        int end = matrix.length - 1;
        
        //Dummy corners matrix to hold the elements to be swapped.
        int[] corners = new int[4];
        
        // Swap the elements from outer layer clockwise.
        // Once the outer layer is done, you can move inwards.
        
        while(start < end) {
            
            for(int offset = 0; offset < (end-start); offset++) {
                corners[0] = matrix[start][start + offset]; // TopLeft
                corners[1] = matrix[start + offset][end];   // TopRight
                corners[2] = matrix[end][end - offset];     // BotoomRight
                corners[3] = matrix[end - offset][start];   // BottomLeft

                matrix[start + offset][end]   = corners[0]; // TopLeft to TopRight
                matrix[end][end - offset]     = corners[1]; // TopRight to BottomRight
                matrix[end - offset][start]   = corners[2]; // BottomRight to BottomLeft
                matrix[start][start + offset] = corners[3]; // BottomLeft to TopLeft
            }
            
            //Move to the inner layer.
            start++;
            end--;
        }
    }
}
