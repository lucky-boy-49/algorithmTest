package org.example.zhongdeng;

import java.util.Arrays;
import java.util.List;

public class S120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        long[] dp = new long[triangle.get(triangle.size() - 1).size()];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = triangle.get(0).get(0);
        long tmp = Integer.MAX_VALUE;
        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j < row.size(); j++) {
                if (j == 0) {
                    tmp = dp[j];
                    dp[j] += row.get(j);
                } else {
                    long tmp2 = dp[j];
                    dp[j] = Math.min(tmp, dp[j]) + row.get(j);
                    tmp = tmp2;
                }
            }
        }
        return (int) Arrays.stream(dp).min().orElse(Integer.MAX_VALUE);
    }
    public int minimumTotal2(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n + 1];
        for (int i = n - 1; i >= 0 ; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}
