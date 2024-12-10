package org.example.zhongdeng;

import java.util.Arrays;

/**
 * 935. 骑士拨号器
 */
public class S935 {
    public int knightDialer(int n) {
        long[][] dp = new long[2][10];
        Arrays.fill(dp[0], 1);
        int mod = 1000000007;
        for (int i = 1; i < n; i++) {
            dp[1][0] = (dp[0][4] + dp[0][6]) % mod;
            dp[1][1] = (dp[0][6] + dp[0][8]) % mod;
            dp[1][2] = (dp[0][7] + dp[0][9]) % mod;
            dp[1][3] = (dp[0][4] + dp[0][8]) % mod;
            dp[1][4] = (dp[0][3] + dp[0][9] + dp[0][0]) % mod;
            dp[1][6] = (dp[0][1] + dp[0][7] + dp[0][0]) % mod;
            dp[1][7] = (dp[0][2] + dp[0][6]) % mod;
            dp[1][8] = (dp[0][1] + dp[0][3]) % mod;
            dp[1][9] = (dp[0][2] + dp[0][4]) % mod;
            dp[0] = dp[1];
            dp[1] = new long[10];
        }
        long res = 0;
        for (long i : dp[0]) {
            res = (res + i) % mod;
        }
        return (int) res;
    }
}
