package org.example.zhongdeng;

public class S740 {
    public int deleteAndEarn(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int[] nums2 = new int[max + 1];
        for (int num : nums) {
            nums2[num] += num;
        }
        int[] dp = new int[nums2.length];
        dp[0] = nums2[0];
        dp[1] = Math.max(nums2[0], nums2[1]);
        for (int i = 2; i < nums2.length; i++) {
            dp[i] = Math.max(nums2[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[nums2.length - 1];
    }
}
