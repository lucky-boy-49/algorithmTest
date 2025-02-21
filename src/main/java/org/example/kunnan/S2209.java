package org.example.kunnan;

/**
 * 2209. 用地毯覆盖后的最少白色砖块
 */
public class S2209 {
    public int minimumWhiteTiles(String floor, int numCarpets, int carpetLen) {
        int n = floor.length();
        if (numCarpets == 0) { // 没有地毯可用，直接返回所有白色砖块数量
            return (int) floor.chars().filter(c -> c == '1').count();
        }

        // 预处理前缀和数组
        int[] sum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + (floor.charAt(i) == '1' ? 1 : 0);
        }
        int totalWhite = sum[n];

        // 如果总覆盖长度足够覆盖所有砖块，直接返回0
        if (numCarpets * carpetLen >= n) {
            return 0;
        }

        // 动态规划数组，dp[k][i]表示用k条地毯覆盖前i块砖的最大覆盖白块数
        int[][] dp = new int[numCarpets + 1][n];

        for (int k = 1; k <= numCarpets; k++) {
            for (int i = 0; i < n; i++) {
                int start = Math.max(0, i - carpetLen + 1);
                int covered = sum[i + 1] - sum[start]; // 当前地毯覆盖的白块数

                // 获取前k-1条地毯在start-1位置的最优解（若start=0则前驱为0）
                int prev = (start > 0 && k > 0) ? dp[k - 1][start - 1] : 0;

                // 状态转移：比较覆盖当前位置和不覆盖的情况
                if (i > 0) {
                    dp[k][i] = Math.max(dp[k][i - 1], prev + covered);
                } else {
                    dp[k][i] = prev + covered; // i=0时只能选择覆盖
                }
            }
        }

        return totalWhite - dp[numCarpets][n - 1];
    }
}
