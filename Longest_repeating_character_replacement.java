class Solution {
    public int characterReplacement(String s, int k) {
        // Sliding window solution to find the maximum length of string.
        int len = s.length();
        int[] count = new int[26]; // Assuming 26 characters are present.
        int start = 0, maxCount = 0, maxLength = 0; // Initlialise these vars to zero.
        for (int end = 0; end < len; end++) {
            maxCount = Math.max(maxCount, ++count[s.charAt(end) - 'A']); // Max repeating character count(continuously)
            while (end - start + 1 - maxCount > k) { //If sequence increases 'k' ---> The replacement value.
                count[s.charAt(start) - 'A']--; // Decrement the length by increasing start index and re-try 
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1); // Compute and Return the maxlen value
        }
        return maxLength;
    }
}
