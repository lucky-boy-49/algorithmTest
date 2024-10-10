package org.example.jiandan;

public class S3162 {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int res = 0;
        int[][] dp = new int[51][51];
        for (int j : nums1) {
            if (j % k != 0) {
                continue;
            }
            for (int value : nums2) {
                if (dp[j][value] == 0) {
                    if (j % (value * k) == 0) {
                        dp[j][value] = 1;
                        res++;
                    } else {
                        dp[j][value] = 2;
                    }
                } else if (dp[j][value] == 1) {
                    res++;
                }
            }
        }
        return res;
    }
}
