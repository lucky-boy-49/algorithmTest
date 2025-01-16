package org.example.jiandan;

/**
 * 3095. 或值至少 K 的最短子数组 I
 */
public class S3095 {
    public int minimumSubarrayLength(int[] nums, int k) {
        int ans = nums.length + 1, left = 0, right = 1, sum = nums[0];
        while (left < right || right < nums.length) {
            if (sum < k && right < nums.length) {
                sum |= nums[right++];
            } else if (sum >= k && left < right) {
                ans = Math.min(ans, right - left);
                sum = sum(nums, ++left, right);
            } else if (left < right) {
                sum = sum(nums, ++left, right);
            } else {
                sum |= nums[right++];
            }
        }
        return ans == nums.length + 1 ? -1 : ans;
    }

    private int sum(int[] nums, int left, int right) {
        int sum = 0;
        for (int i = left; i < right; i++) {
            sum |= nums[i];
        }
        return sum;
    }
}
