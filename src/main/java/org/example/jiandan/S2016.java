package org.example.jiandan;

/**
 * 2016. 增量元素之间的最大差值
 */
public class S2016 {
    public int maximumDifference(int[] nums) {
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int size = nums[j] - nums[i];
                if (nums[i] < nums[j] && ans < size) {
                    ans = size;
                }
            }
        }
        return ans;
    }
}
