class Solution {
    public int[] constructRectangle(int area) {
        // Declare an array to store our answer in it.
        int[] ans = new int[2];
        int width, length;
        
        // Calculate the width by finding sqrt. Width < length is ensured.
        width = (int) Math.sqrt(area);
        // Decrement the width till it's modulo becomes zero.
        while(area%width !=0)
        {
            width--;
        }
        
        // Calculate teh length and return the result.
        length = area/width;
        ans[0] = length;
        ans[1] = width;
        
        return ans;
    }
}
