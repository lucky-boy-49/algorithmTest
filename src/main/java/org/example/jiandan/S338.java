package org.example.jiandan;

/**
 * 338. 比特位计数
 */
public class S338 {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            res[i] = res[i & (i - 1)] + 1;
        }
        return res;
    }
}
