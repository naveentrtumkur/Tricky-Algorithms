/********

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:

Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.
Example:

Input: "cbbd"

Output: "bb"
*****/

class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxlen = 0;
        String res = null;
        boolean[][] dp = new boolean[n][n];
        int palindromeStartsAt = 0;
        
        for(int i=n-1;i>=0;i--)
        {
            for( int j=i;j<n;j++)
            {
                //Calculation of dp[i][j]
                dp[i][j] = (s.charAt(i) == s.charAt(j) && (j-i<3 || dp[i+1][j-1]));
                
                //If the dp[i][j] is set to true then we will calculate the maxlength
                if(dp[i][j] && (j-i+1 > maxlen ))
                {
                    maxlen = j-i +1;
                    palindromeStartsAt = i;
                    res = s.substring(palindromeStartsAt,palindromeStartsAt+maxlen);
                }
            }
        }
        return res;
        
    }
}
