package org.example.kunnan;

import java.util.Arrays;

/**
 * 1278. 分割回文串 III
 */
public class S1278 {
    private int[][][] dp;

    public int palindromePartition(String s, int k) {
        dp = new int[s.length() + 1][s.length() + 1][k + 1];
        for (int[][] ints : dp) {
            for (int[] anInt : ints) {

                Arrays.fill(anInt, -1);

            }
        }
        return dfs(s, k, 0, 0);
    }

    private int dfs(String s, int k, int size, int i) {
        if (size == k && i == s.length()) {
            return 0;
        } else if (size == k && i < s.length()) {
            return Integer.MAX_VALUE;
        } else {
            int oldRes = Integer.MAX_VALUE;
            for (int j = i; j < s.length(); j++) {
                String substring = s.substring(i, j + 1);
                if (dp[i][j + 1][size + 1] < 0) {
                    dp[i][j + 1][size + 1] = dfs(s, k, size + 1, j + 1);
                }
                int newRes = dp[i][j + 1][size + 1] == Integer.MAX_VALUE ? Integer.MAX_VALUE :
                        check(substring) + dp[i][j + 1][size + 1];
                oldRes = Math.min(oldRes, newRes);
            }
            return oldRes;
        }
    }

    private int check(String s) {
        int res = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                res++;
            }
        }
        return res;
    }
}
