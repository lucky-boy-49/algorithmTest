package org.example.jiandan;

/**
 * 2873. 有序三元组中的最大值 I
 */
public class S2873 {
    public long maximumTripletValue(int[] nums) {
        int[] leftMax = new int[nums.length];
        leftMax[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            leftMax[i] = Math.max(nums[i], leftMax[i + 1]);
        }
        long ans = Long.MIN_VALUE;
        int max = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            ans = Math.max(ans, getRes(max, nums[i], leftMax[i + 1]));
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return ans < 0 ? 0 : ans;
    }

    private long getRes(int a, int b, int c) {
        return ((long) a - b) * c;
    }
}
