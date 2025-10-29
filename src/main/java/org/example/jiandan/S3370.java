package org.example.jiandan;

/**
 * 3370. 仅含置位位的最小整数
 */
public class S3370 {
    public int smallestNumber(int n) {
        while (true) {
            if (Integer.bitCount(n) == 32 - Integer.numberOfLeadingZeros(n)) {
                return n;
            }
            n++;
        }
    }
}
