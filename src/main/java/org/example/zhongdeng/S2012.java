package org.example.zhongdeng;

/**
 * 2012. 数组美丽值求和
 */
public class S2012 {
    public int sumOfBeauties(int[] nums) {
        int i = 1;
        int[][] dp = new int[nums.length][2];
        dp[0][0] = nums[0];
        dp[nums.length - 1][1] = nums[nums.length - 1];
        for (; i < nums.length; i++) {
            dp[i][0] = Math.max(nums[i - 1], dp[i - 1][0]);
            dp[nums.length - i - 1][1] = Math.min(nums[nums.length - i], dp[nums.length - i][1]);
        }
        int res = 0;
        for (i = 1; i < nums.length - 1; i++) {
            if (dp[i][0] < nums[i] && nums[i] < dp[i][1]) {
                res += 2;
            } else if (nums[i - 1] < nums[i] && nums[i] < nums[i + 1]) {
                res++;
            }
        }
        return res;
    }
}
