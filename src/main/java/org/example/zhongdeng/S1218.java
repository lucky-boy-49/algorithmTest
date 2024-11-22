package org.example.zhongdeng;

/**
 * 1218. 最长定差子序列
 */
public class S1218 {
    public int longestSubsequence(int[] arr, int difference) {
        int[] dp = new int[40001];
        int res = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            dp[arr[i] - difference + 20000] = dp[arr[i] + 20000] + 1;
            if (dp[arr[i] - difference + 20000] > res) {
                res = dp[arr[i] - difference + 20000];
            }
        }
        return res;
    }
}
