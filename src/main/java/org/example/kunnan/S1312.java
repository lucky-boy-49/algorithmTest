package org.example.kunnan;

/**
 * 1312. 让字符串成为回文串的最少插入次数
 */
public class S1312 {
    public int minInsertions(String s) {
        char[] str = s.toCharArray();
        int n = str.length;
        int[] dp = new int[n];

        for (int i = n - 2, leftDown; i >= 0; i--) {
            leftDown = dp[i + 1];
            dp[i + 1] = str[i] == str[i + 1] ? 0 : 1;
            for (int j = i + 2, t; j < n; j++) {
                t = dp[j];
                if (str[i] == str[j]) {
                    dp[j] = leftDown;
                } else {
                    dp[j] = Math.min(t, dp[j - 1]) + 1;
                }
                leftDown = t;
            }
        }
        return dp[n - 1];
    }
}
