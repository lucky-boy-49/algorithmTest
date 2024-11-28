package org.example.kunnan;

/**
 * 3250. 单调数组对的数目 I
 */
public class S3250 {
    public int countOfPairs(int[] nums) {
        int[][] dp = new int[nums.length][51];
        for (int i = 0; i <= nums[0]; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int num = 0; num <= nums[i]; num++) {
                int sum = 0;
                for (int dpi = 0; dpi <= num; dpi++) {
                    if (dp[i - 1][dpi] >= 1 && nums[i - 1] - dpi >= nums[i] - num) {
                        sum = (sum + dp[i - 1][dpi]) % 1_000_000_007;
                    }
                }
                dp[i][num] = sum;
            }
        }
        int sum = 0;
        for (int i : dp[nums.length - 1]) {
            sum = (sum + i) % 1_000_000_007;
        }
        return sum;
    }
}
