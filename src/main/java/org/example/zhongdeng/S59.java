package org.example.zhongdeng;

/**
 * 59. 螺旋矩阵 II
 */
public class S59 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int size = 1, i = 0, j = 0;
        res[i][j] = 1;
        boolean flag;
        do {
            flag = false;
            while (j + 1 < n && res[i][j + 1] == 0) {
                res[i][++j] = ++size;
                flag = true;
            }
            while (i + 1 < n && res[i + 1][j] == 0) {
                res[++i][j] = ++size;
                flag = true;
            }
            while (j - 1 >= 0 && res[i][j - 1] == 0) {
                res[i][--j] = ++size;
                flag = true;
            }
            while (i - 1 >= 0 && res[i - 1][j] == 0) {
                res[--i][j] = ++size;
                flag = true;
            }

        } while (flag);
        return res;
    }
}
