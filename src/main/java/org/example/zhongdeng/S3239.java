package org.example.zhongdeng;

/**
 * 3239. 最少翻转次数使二进制矩阵回文 I
 */
public class S3239 {
    public int minFlips(int[][] grid) {
        int sum1 = 0, sum2 = 0, m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n / 2 && grid[i][j] != grid[i][n - 1 - j]) sum1++;
                if (i < m / 2 && grid[i][j] != grid[m - 1 - i][j]) sum2++;
            }
        }
        return Math.min(sum1, sum2);
    }
    public int minFlips2(int[][] grid) {
        int sum1 = 0, sum2 = 0, m = grid.length, n = grid[0].length;
        int i = 0, j = 0;
        for (; i < m / 2; i++) {
            j = 0;
            for (; j < n / 2; j++) {
                sum1 += grid[i][j] ^ grid[i][n - 1 - j];
                sum2 += grid[i][j] ^ grid[m - 1 - i][j];
            }
        }
        for (; i < m; i++) {
            for (int k = 0; k < n / 2; k++) {
                sum1  += (grid[i][k] ^ grid[i][n - k - 1]);
            }
        }
        for (; j < n; j++) {
            for (int k = 0; k < m / 2; k++) {
                sum2  += (grid[k][j] ^ grid[m - k - 1][j]);
            }
        }

        return Math.min(sum1, sum2);
    }
}
