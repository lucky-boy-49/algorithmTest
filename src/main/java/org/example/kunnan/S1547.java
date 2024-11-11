package org.example.kunnan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class S1547 {
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        List<Integer> list = new ArrayList<>();
        if (cuts[0] != 0) list.add(0);
        IntStream.of(cuts).forEach(list::add);
        if (cuts[cuts.length-1] != n) list.add(n);
        int m = list.size();
        // dp[i][j] 表示 木棍第 i 次切割到 j 次切割 的最小成本
        int[][] dp = new int[m][m];
        for (int i = 2; i < m; i++) {
            for (int j = 0; j < m-i; j++) {
                dp[j][j+i] = Integer.MAX_VALUE;
                int p = list.get(j+i) - list.get(j);
                for (int k = j+1; k < j+i; k++) {
                    dp[j][j+i] = Math.min(dp[j][j+i], dp[j][k] + dp[k][j+i] + p);
                }
            }
        }
        return dp[0][m-1];
    }
}
