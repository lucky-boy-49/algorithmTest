package org.example.jiandan;

/**
 * 2643. 一最多的行
 */
public class S2643 {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans = new int[2];
        for (int i = 0; i < mat.length; i++) {
            int curSize = 0;
            for (int j = 0; j < mat[i].length; j++) {
                curSize += mat[i][j];
            }
            if (curSize == mat[i].length) {
                return new int[]{i, curSize};
            }
            if (curSize > ans[1]) {
                ans[1] = curSize;
                ans[0] = i;
            }
        }
        return ans;
    }
}
