package org.example.jiandan;

import java.util.List;

/**
 * 3349. 检测相邻递增子数组 I
 */
public class S3349 {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if (k == 1) {
            return true;
        }
        var flag = new int[nums.size()];
        var size = 1;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                size++;
                int oldIdx = i - (2 * k) + 1;
                if (size >= k && oldIdx >= 0 && flag[oldIdx] == 1) {
                    return true;
                } else if (size >= k) {
                    flag[i - k + 1] = 1;
                }
            } else {
                size = 1;
            }
        }
        return false;
    }
}
