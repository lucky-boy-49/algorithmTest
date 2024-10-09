package org.example.zhongdeng;

import java.util.Arrays;

public class S45 {
    int[] dp;
    boolean[] dp2;

    public int jump(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp2 = new boolean[nums.length];
        return dfs(nums, 0) - 1;
    }

    private int dfs(int[] nums, int i) {
        int num = nums[i];
        int res = Integer.MAX_VALUE;
        if (i == nums.length - 1) {
            return 1;
        }
        for (int j = 1; j <= num && i + j < nums.length; j++) {
            if (dp2[i + j]) {
                res = Math.min(res, dp[i + j]);
                dp2[i + j] = true;
                continue;
            }
            int dfs = dfs(nums, i + j);
            res = Math.min(res, dfs);
            dp[i + j] = Math.min(dp[i + j], dfs);
        }
        return res == Integer.MAX_VALUE ? res : res + 1;
    }
}
