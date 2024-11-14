package org.example.zhongdeng;

/**
 * 72. 编辑距离
 */
public class S72 {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        char[] word1CharArray = word1.toCharArray();
        char[] word2CharArray = word2.toCharArray();
        for (int i = 0; i <= word1CharArray.length; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i <= word2CharArray.length; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (word1CharArray[i - 1] == word2CharArray[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j])) + 1;
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
    public int minDistance2(String word1, String word2) {
        int n = word2.length();
        char[] t = word2.toCharArray();
        int[] f = new int[n + 1];
        for (int j = 1; j <= n; j++) {
            f[j] = j;
        }
        for (char si : word1.toCharArray()) {
            // 暂存 f[0], 前一行的结果
            int pre = f[0];
            // f[0]++, 遍历下一行
            f[0]++;
            for (int j = 0; j < n; j++) {
                // 暂存 f[j + 1], 下一行的结果
                int tmp = f[j + 1];
                // 计算 f[j + 1], 下一行的结果
                f[j + 1] = si == t[j] ? pre : Math.min(Math.min(f[j + 1], f[j]), pre) + 1;
                pre = tmp;
            }
        }
        return f[n];
    }
}
