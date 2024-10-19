package org.example.zhongdeng;

public class S3192 {
    public int minOperations(int[] nums) {
        int res = 0;
        int[] dp = new int[2];
        dp[1] = 1;
        for (int j : nums) {
            int num = dp[j];
            if (num == 0) {
                res++;
                dp[0] ^= 1;
                dp[1] ^= 1;
            }
        }
        return res;
    }
}
