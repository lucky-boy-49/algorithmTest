package org.example.zhongdeng;

/**
 * 1035. 不相交的线
 */
public class S1035 {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return maxUncrossedLines(nums2, nums1);
        }
        int[] dp = new int[nums2.length + 1];
        for (int k : nums1) {
            int pre = 0;
            for (int j = 0; j < nums2.length; j++) {
                final int temp = dp[j + 1];
                if (k == nums2[j]) {
                    dp[j + 1] = pre + 1;
                } else {
                    dp[j + 1] = Math.max(dp[j], temp);
                }
                pre = temp;
            }
        }
        return dp[nums2.length];
    }
}
