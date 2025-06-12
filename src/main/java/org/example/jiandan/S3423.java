package org.example.jiandan;

/**
 * 3423. 循环数组中相邻元素的最大差值
 */
public class S3423 {
    public int maxAdjacentDistance(int[] nums) {
        int len = nums.length;
        int ans = Math.abs(nums[0] - nums[len - 1]);
        for (int i = 0; i < len - 1; i++) {
            ans = Math.max(ans, Math.abs(nums[i] - nums[i + 1]));
        }
        return ans;
    }
}
