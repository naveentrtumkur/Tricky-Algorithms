// Summation of all the  peaks.
// O(n) time and O(1) space complexity
class Solution {
    public int maxProfit(int[] prices) {
        //int maxprofit = -999;
        int maxprofit = 0; // the default value is specified.
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
}
