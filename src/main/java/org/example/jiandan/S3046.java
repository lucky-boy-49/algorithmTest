package org.example.jiandan;

/**
 * 3046. 分割数组
 */
public class S3046 {
    public boolean isPossibleToSplit(int[] nums) {
        int[] dp = new int[101];
        for (int num : nums) {
            dp[num]++;
            if (dp[num] > 2) {
                return false;
            }
        }
        return true;
    }
}
