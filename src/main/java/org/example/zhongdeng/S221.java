package org.example.zhongdeng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S221 {
    public int maximalSquare(char[][] matrix) {
        int m = Math.min(matrix.length, matrix[0].length);
        int res = 0;
        char[][] dp = new char[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = '1';
                    res = 1;
                } else {
                    dp[i][j] = '0';
                }
            }
        }
        for (int i = 2; i <= m; i++) {
            for (int j = 0; j < matrix.length - i + 1; j++) {
                for (int k = 0; k < matrix[0].length - i + 1; k++) {
                    if (dp[j][k] == '0') {
                        continue;
                    }
                    boolean flag = true;
                    for (int l = 0; l < i; l++) {
                        if (!flag) {
                            break;
                        }
                        flag = matrix[j + i - 1][k + l] == '1';
                        if (!flag) {
                            break;
                        }
                        flag = matrix[j + l][k + i - 1] == '1';
                    }
                    if (flag) {
                        res = Math.max(res, i * i);
                    }
                    dp[j][k] = flag ? '1' : '0';
                }
            }
        }
        return res;
    }
    public int maximalSquare2(char[][] matrix) {
        int m = Math.min(matrix.length, matrix[0].length), res = 0;
        List<List<Integer>> dp = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    dp.add(Arrays.asList(i, j));
                    res = 1;
                }
            }
        }
        for (int i = 2; i <= m; i++) {
            List<List<Integer>> dp2 = new ArrayList<>();
            for (List<Integer> list : dp) {
                boolean flag = true;
                for (int l = 0; l < i; l++) {
                    if (list.get(1) + l >= matrix[0].length || list.get(0) + l >= matrix.length ||
                            list.get(0) + i - 1 >= matrix.length || list.get(1) + i - 1 >= matrix[0].length) {
                        flag = false;
                    }
                    if (!flag) {
                        break;
                    }
                    flag = matrix[list.get(0) + i - 1][list.get(1) + l] == '1';
                    if (!flag) {
                        break;
                    }
                    flag = matrix[list.get(0) + l][list.get(1) + i - 1] == '1';
                }
                if (flag) {
                    res = Math.max(res, i * i);
                    dp2.add(list);
                }
            }
            dp = dp2;
        }
        return res;
    }
    public int maximalSquare3(char[][] matrix) {
        int res = 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == '1') res = 1;
            dp[0][i] = matrix[0][i] == '1' ? 1 : 0;
        }
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == '1') res = Math.max(res, 1);
            dp[i][0] = matrix[i][0] == '1' ? 1 : 0;
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1' && dp[i - 1][j - 1] >= 1) {
                    int k;
                    for (k = 0; k <= dp[i - 1][j - 1]; k++) {
                        if (matrix[i][j - k] == '0' || matrix[i - k][j] == '0') {
                            break;
                        }
                    }
                    if (k > dp[i - 1][j - 1]) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = k > 0 ? k : (matrix[i][j] == '1' ? 1 : 0);
                    }
                } else {
                    dp[i][j] = matrix[i][j] == '1' ? 1 : 0;
                }
                res = Math.max(res, dp[i][j] * dp[i][j]);
            }
        }
        return res;
    }
}
