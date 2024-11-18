package org.example.kunnan;

public class S188 {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[] dp = new int[2 * k + 1];
        for (int i = 1; i <= 2 * k; i += 2) {
            dp[i] = -prices[0];
            dp[i + 1] = 0;
        }
        for (int i = 1; i < n; ++i) {
            for (int j = 1; j <= 2 * k; j += 2) {
                dp[j] = Math.max(dp[j], dp[j - 1] - prices[i]);
                dp[j + 1] = Math.max(dp[j + 1], dp[j] + prices[i]);
            }
        }
        return dp[2 * k];
    }
}
