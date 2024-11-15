package org.example.zhongdeng;

/**
 * 712. 两个字符串的最小ASCII删除和
 */
public class S712 {
    public int minimumDeleteSum(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 1; i <= s1.length(); i++) dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
        for (int i = 1; i <= s2.length(); i++) dp[0][i] = dp[0][i - 1] + s2.charAt(i - 1);
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    int size1 = dp[i - 1][j] + s1.charAt(i - 1);
                    int size2 = dp[i][j - 1] + s2.charAt(j - 1);
                    int size3 = dp[i - 1][j - 1] + s1.charAt(i - 1) + s2.charAt(j - 1);
                    dp[i][j] = Math.min(size1, Math.min(size2, size3));
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
    public int minimumDeleteSum2(String s1, String s2) {
        int n = s2.length();
        char[] c2 = s2.toCharArray();
        char[] c1 = s1.toCharArray();
        int[] dp = new int[n + 1];
        for (int j = 1; j <= n; j++) {
            dp[j] = dp[j - 1] + s2.charAt(j - 1);
        }
            for (char c : c1) {
            int pre = dp[0];
            dp[0] += c;
            for (int j = 0; j < n; j++) {
                int tmp = dp[j + 1];
                dp[j + 1] = c == c2[j] ? pre : Math.min(pre + c2[j] + c, Math.min(tmp + c, dp[j] + c2[j]));
                pre = tmp;
            }
        }
        return dp[n];
    }
}
