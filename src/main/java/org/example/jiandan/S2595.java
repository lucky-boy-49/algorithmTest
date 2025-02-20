package org.example.jiandan;

/**
 * 2595. 奇偶位数
 */
public class S2595 {
    public int[] evenOddBit(int n) {
        int[] res = new int[2];
        int i = 0;
        do {
            int mask = n | 1;
            if (mask <= n) {
                res[i & 1]++;
            }
            n = n >> 1;
            i++;
        } while (n > 0);
        return res;
    }
}
