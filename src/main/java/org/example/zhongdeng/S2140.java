package org.example.zhongdeng;

/**
 * 2140. 解决智力问题
 */
public class S2140 {
    public long mostPoints(int[][] questions) {
        int len = questions.length;
        long[] dp = new long[len];
        dp[len - 1] = questions[len - 1][0];
        for (int i = 2; i <= len; i++) {
            int index = len - i + questions[len - i][1] + 1;
            long max = questions[len - i][0] + (index >= len ? 0 : dp[index]);
            dp[len - i] = Math.max(dp[len - i + 1], max);
        }
        return dp[0];
    }
}
