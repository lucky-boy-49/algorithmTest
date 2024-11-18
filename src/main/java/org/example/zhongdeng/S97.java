package org.example.zhongdeng;

public class S97 {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s3.length() != s1.length() + s2.length()) return false;
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        dp[0][0] = true;
        for (int i = 0; i < s1.length(); i++) {
            dp[i + 1][0] = s1.charAt(i) == s3.charAt(i) && dp[i][0];
        }
        for (int i = 0; i < s2.length(); i++) {
            dp[0][i + 1] = s2.charAt(i) == s3.charAt(i) && dp[0][i];
        }
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if(!dp[i - 1][j] && !dp[i][j - 1]) continue;
                dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) ||
                        (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(j + i - 1));
            }
        }
        return dp[s1.length()][s2.length()];
    }
}
