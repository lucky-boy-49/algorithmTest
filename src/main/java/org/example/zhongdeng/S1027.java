package org.example.zhongdeng;

/**
 * 1027. 最长等差数列
 */
public class S1027 {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int res = 0;
        int[][] dp = new int[n][1001];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int diff = nums[i] - nums[j];
                dp[i][diff + 500] = dp[j][diff + 500] + 1;
                res = Math.max(res, dp[i][diff + 500]);
            }
        }
        return res + 1;
    }
}
