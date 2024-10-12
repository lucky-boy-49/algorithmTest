package org.example.jiandan;

public class S3158 {
    public int duplicateNumbersXOR(int[] nums) {
        long dp = 0;
        int res = 0;
        for (int num : nums) {
            if ((dp >> num & 1) == 1) {
                res ^= num;
            } else {
                dp |= 1L << num;
            }
        }
        return res;
    }
}
