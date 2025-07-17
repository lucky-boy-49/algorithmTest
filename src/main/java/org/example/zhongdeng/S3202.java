package org.example.zhongdeng;

/**
 * 3202. 找出有效子序列的最大长度 II
 */
public class S3202 {
    public int maximumLength(int[] nums, int k) {
        int[][] dp = new int[k][k];
        int ans = 0;
        for (int num : nums) {
            int remainder = num % k;
            for (int i = 0; i < k; i++) {
                dp[i][remainder] = dp[remainder][i] + 1;
                ans = Math.max(ans, dp[i][remainder]);
            }
        }
        return ans;
    }
}
