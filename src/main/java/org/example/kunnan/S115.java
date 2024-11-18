package org.example.kunnan;

/**
 * 115. 不同的子序列
 */
public class S115 {
    public int numDistinct(String s, String t) {
        int[] dp = new int[s.length() + 1];
        for (int i = 0; i <= s.length(); i++) {
            dp[i] = 1;
        }
        for (int i = 1; i <= t.length(); i++) {
            int tmp = dp[i - 1];
            dp[i - 1] = 0;
            for (int j = i; j <= s.length(); j++) {
                int tmp2 = dp[j];
                dp[j] = dp[j - 1] + (t.charAt(i - 1) == s.charAt(j - 1) ? tmp : 0);
                tmp = tmp2;
            }
        }
        return dp[s.length()];
    }
}
