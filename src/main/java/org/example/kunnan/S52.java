package org.example.kunnan;

/**
 * 52. N 皇后 II
 */
public class S52 {
    public int totalNQueens(int n) {
        boolean[] col = new boolean[n];
        boolean[] diag1 = new boolean[2 * n - 1];
        boolean[] diag2 = new boolean[2 * n - 1];
        int[] ans = new int[1];
        dfs(0, ans, col, diag1, diag2);
        return ans[0];
    }

    private void dfs(int r, int[] ans, boolean[] col, boolean[] diag1, boolean[] diag2) {
        int n = col.length;
        if (r == n) {
            ans[0]++;
            return;
        }

        for (int c = 0; c < n; c++) {
            int rc = r - c + n - 1;//防止负数
            if (!col[c] && !diag1[r + c] && !diag2[rc]) {
                col[c] = diag1[r + c] = diag2[rc] = true;
                dfs(r + 1, ans, col, diag1, diag2);
                col[c] = diag1[r + c] = diag2[rc] = false;
            }
        }
    }
}
