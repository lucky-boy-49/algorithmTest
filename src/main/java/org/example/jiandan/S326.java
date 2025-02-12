package org.example.jiandan;

/**
 * 326. 3 的幂
 */
public class S326 {
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
