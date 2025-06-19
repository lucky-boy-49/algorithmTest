package org.example.zhongdeng;

import java.util.Arrays;

/**
 * 2294. 划分数组使最大差为 K
 */
public class S2294 {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0, i = 0, j = 0;
        for (; j < nums.length; j++) {
            if (nums[j] - nums[i] > k) {
                ans++;
                i = j;
            }
        }
        ans++;
        return ans;
    }

}
