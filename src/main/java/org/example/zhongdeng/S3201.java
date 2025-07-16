package org.example.zhongdeng;

/**
 * 3201. 找出有效子序列的最大长度 I
 */
public class S3201 {
    public int maximumLength(int[] nums) {
        int len = nums.length;
        int[][] dp = new int[len][2];
        int res = 1;
        dp[0][0] = 1;
        dp[0][1] = 1;
        for (int i = 1; i < len; i++) {
            boolean flag1 = false, flag2 = false;
            int j = i - 1;
            for (; j >= 0; j--) {
                if (!flag1 && (nums[i] + nums[j]) % 2 == 0) {
                    dp[i][0] = dp[j][0] + 1;
                    flag1 = true;
                }
                if (!flag2 && (nums[i] + nums[j]) % 2 == 1) {
                    dp[i][1] = dp[j][1] + 1;
                    flag2 = true;
                }
                if (flag1 && flag2) {
                    break;
                }
            }
            if (j < 0 && !flag1) {
                dp[i][0] = 1;
            }
            if (j < 0 && !flag2) {
                dp[i][1] = 1;
            }
            res = Math.max(res, dp[i][0]);
            res = Math.max(res, dp[i][1]);
        }
        return res;
    }

    public int maximumLength2(int[] nums) {
        // 00  10  01  11
        //  00  01  10  11
        int[][] dp = new int[2][2];

        for (int x : nums) {
            int i = x & 1;

            for (int j = 0; j < 2; j++) {
                dp[j][i] = dp[i][j] + 1;
            }
        }

        return Math.max(Math.max(dp[0][0], dp[0][1]), Math.max(dp[1][0], dp[1][1]));
    }

}
