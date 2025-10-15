package org.example.zhongdeng;

import java.util.List;

/**
 * 3350. 检测相邻递增子数组 II
 */
public class S3350 {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        if (nums.size() == 2) {
            return 1;
        }
        var arr = nums.toArray(new Integer[0]);
        var flag = new int[nums.size()];
        var ans = 0;
        var size = 1;
        flag[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                size++;
                flag[i] = size;
            } else {
                flag[i] = size = 1;
            }
            if (size % 2 == 0) {
                ans = Math.max(ans, size / 2);
            }
            if (i - flag[i] > -1 && flag[i] <= flag[i - flag[i]]) {
                ans = Math.max(ans, flag[i]);
            }
        }
        return ans;
    }
}
