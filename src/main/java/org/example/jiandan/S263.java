package org.example.jiandan;

/**
 * 263. 丑数
 */
public class S263 {
    private static final int[] NUM = {2, 3, 5};

    public boolean isUgly(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        for (int num : NUM) {
            while (n % num == 0) n /= num;
        }
        return n == 1;
    }
}
