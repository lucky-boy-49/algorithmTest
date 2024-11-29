package org.example.kunnan;

import java.util.ArrayList;
import java.util.List;

/**
 * 3251. 单调数组对的数目 II
 */
public class S3251 {
    public int countOfPairs(int[] nums) {
        List<List<int[]>> dp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            dp.add(new ArrayList<>());
        }
        for (int i = 0; i <= nums[0]; i++) {
            dp.get(0).add(new int[]{i, 1});
        }
        for (int i = 1; i < nums.length; i++) {
            if (dp.get(i - 1).isEmpty()) {
                break;
            }
            if (nums[i] == nums[i - 1]) {
                List<int[]> preList = dp.get(i - 1);
                dp.get(i).add(new int[]{dp.get(i - 1).get(0)[0], preList.get(0)[1]});
                for (int j = 1; j < preList.size(); j++) {
                    dp.get(i).add(new int[]{preList.get(j)[0], (preList.get(j)[1] + dp.get(i).get(j - 1)[1]) % 1_000_000_007});
                }
            } else {
                for (int num = 0; num <= nums[i]; num++) {
                    int sum = 0;
                    for (int[] pre : dp.get(i - 1)) {
                        if (pre[0] <= num && nums[i - 1] - pre[0] >= nums[i] - num) {
                            sum = (sum + pre[1]) % 1_000_000_007;
                        }
                    }
                    if (sum != 0) {
                        dp.get(i).add(new int[]{num, sum});
                    }
                }
            }
        }
        int sum = 0;
        for (int[] ans : dp.get(nums.length - 1)) {
            sum = (sum + ans[1]) % 1_000_000_007;
        }
        return sum;
    }

    public int countOfPairs2(int[] nums) {
        int n = nums.length, mod = (int) 1e9 + 7;
        // dp[i][j] 表示 前 i 个数字, 最后一个递增数字是小于 j 得数组对数目
        long[][] dp = new long[n][1001];
        dp[0][0] = 1;
        for (int i = 1; i <= nums[0]; i++) {
            dp[0][i] = dp[0][i - 1] + 1;
        }
        for (int i = 1; i < n; i++) {
            int dn = nums[i] - nums[i - 1];
            dp[i][0] = dn > 0 ? 0 : dp[i - 1][0];
            for (int j = 1; j <= nums[i]; j++) {
                if (j - dn < 0) continue;
                dp[i][j] = (dp[i][j - 1] + dp[i - 1][Math.min(j - dn, j)]) % mod;
            }
        }
        return (int) dp[n - 1][nums[n - 1]];
    }
}
