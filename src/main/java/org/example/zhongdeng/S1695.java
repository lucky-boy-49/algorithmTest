package org.example.zhongdeng;

import java.util.HashSet;
import java.util.Set;

/**
 * 1695. 删除子数组的最大得分
 */
public class S1695 {
    public int maximumUniqueSubarray(int[] nums) {
        var ans = 0;
        int i = 0, j = 0, size = 0;
        Set<Integer> set = new HashSet<>(nums.length);
        while (j < nums.length) {
            if (set.contains(nums[j])) {
                ans = Math.max(ans, size);
                while (i <= j) {
                    set.remove(nums[i]);
                    size -= nums[i];
                    if (nums[i++] == nums[j]) {
                        break;
                    }
                }
            }
            set.add(nums[j]);
            size += nums[j];
            j++;
        }
        return Math.max(ans, size);
    }
}
