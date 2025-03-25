package org.example.zhongdeng;

/**
 * 2711. 对角线上不同值的数量差
 */
public class S2711 {
    public int[][] differenceOfDistinctValues(int[][] grid) {
        int[][] ans = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int topLeft = 0, bottomRight = 0, i1 = i - 1, i2 = j - 1;
                long size = 0;
                while (i1 >= 0 && i2 >= 0) {
                    if (((size >> grid[i1][i2]) & 1) == 0) {
                        topLeft++;
                        size |= (1L << grid[i1][i2]);
                    }
                    i1--;
                    i2--;
                }
                size = 0;
                i1 = i + 1;
                i2 = j + 1;
                while (i1 < grid.length && i2 < grid[i].length) {
                    if (((size >> grid[i1][i2]) & 1) == 0) {
                        bottomRight++;
                        size |= (1L << grid[i1][i2]);
                    }
                    i1++;
                    i2++;
                }
                ans[i][j] = Math.abs(topLeft - bottomRight);
            }
        }
        return ans;
    }
}
