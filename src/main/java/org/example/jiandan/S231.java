package org.example.jiandan;

public class S231 {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && ((n & (n - 1)) == 0);
    }
}
