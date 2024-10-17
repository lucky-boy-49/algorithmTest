package org.example.kunnan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class S3193 {
    private static final int MOD = 1000000007;
    private final Map<Integer, Integer> reqMap = new HashMap<>();
    private int[][] dp;

    public int numberOfPermutations(int n, int[][] requirements) {
        int maxCnt = 0;
        reqMap.put(0, 0);
        for (int[] req : requirements) {
            reqMap.put(req[0], req[1]);
            maxCnt = Math.max(maxCnt, req[1]);
        }
        if (reqMap.get(0) != 0) {
            return 0;
        }

        dp = new int[n][maxCnt + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return dfs(n - 1, reqMap.get(n - 1));
    }

    private int dfs(int end, int cnt) {
        if (end == 0) {
            return 1;
        }
        if (dp[end][cnt] != -1) {
            return dp[end][cnt];
        }
        if (reqMap.containsKey(end - 1)) {
            int r = reqMap.get(end - 1);
            if (r <= cnt && cnt <= end + r) {
                return dp[end][cnt] = dfs(end - 1, r);
            } else {
                return dp[end][cnt] = 0;
            }
        } else {
            int sm = 0;
            for (int i = 0; i <= Math.min(end, cnt); ++i) {
                sm = (sm + dfs(end - 1, cnt - i)) % MOD;
            }
            return dp[end][cnt] = sm;
        }
    }
}
