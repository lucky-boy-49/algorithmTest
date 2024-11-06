package org.example.zhongdeng;

import java.util.Arrays;

public class S3254 {
    public int[] resultsArray(int[] nums, int k) {
        if (k == 1) {
            return nums;
        }
        int[] dp = new int[nums.length];
        int[] res = new int[nums.length - k + 1];
        int resIndex = 0;
        dp[0] = 1;
        for (int i = 1; i < k; i++) {
            if (nums[i] - nums[i - 1] == 1) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = 1;
            }
            if (i == k - 1) {
                if (dp[i] == k) {
                    res[resIndex++] = nums[i];
                } else {
                    res[resIndex++] = -1;
                }
            }
        }
        for (int i = k; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 1 && (dp[i - 1] == k - 1 || dp[i - 1] == k)) {
                res[resIndex++] = nums[i];
                dp[i] = k;
            } else if (nums[i] - nums[i - 1] == 1) {
                dp[i] = dp[i - 1] + 1;
                res[resIndex++] = -1;
            } else {
                dp[i] = 1;
                res[resIndex++] = -1;
            }
        }
        return res;
    }

    public int[] resultsArray2(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Arrays.fill(ans, -1);
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt = i == 0 || nums[i] - nums[i - 1] != 1 ? 1 : cnt + 1;
            if (cnt >= k) {
                ans[i - k + 1] = nums[i];
            }
        }
        return ans;
    }
}
