package org.example.zhongdeng;

/**
 * 1143. 最长公共子序列
 */
public class S1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1.length() > text2.length()) {
            return longestCommonSubsequence(text2, text1);
        }
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
