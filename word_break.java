//word break

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // dp[j] = true if s.substring(0, i) can be segmented
        //       = true if dp[i] == true && s.substring(i, j) is in worDict for any i = 0...j
        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for (int j = 1; j <= s.length(); j++) {
            for (int i = 0; i < j; i++) {
                if (dp[i] && wordSet.contains(s.substring(i, j))) {
                    dp[j] = true;
                }
            }
        }                                
        return dp[s.length()];             
    }
}
