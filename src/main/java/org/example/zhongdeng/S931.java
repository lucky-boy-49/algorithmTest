package org.example.zhongdeng;

import java.util.Arrays;

public class S931 {
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        System.arraycopy(matrix[0], 0, dp[0], 0, matrix[0].length);
        for (int i = 1; i < matrix.length; i++) {
            dp[i][0] = Math.min(dp[i - 1][0], dp[i - 1][1]) + matrix[i][0];
            dp[i][matrix.length - 1] = Math.min(dp[i - 1][matrix.length - 2], dp[i - 1][matrix.length - 1]) + matrix[i][matrix.length - 1];
            for (int j = 1; j < matrix[0].length - 1; j++) {
                dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i - 1][j + 1]) + matrix[i][j];
            }
        }
        return Arrays.stream(dp[dp.length - 1]).min().orElse(Integer.MAX_VALUE);
    }
}
