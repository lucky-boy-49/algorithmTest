package org.example.jiandan;

import java.util.HashSet;

/**
 * 3354. 使数组元素等于零
 */
public class S3354 {
    public int countValidSelections(int[] nums) {
        int len = nums.length;
        var leftSum = new int[len + 1];
        var rightSum = new int[len + 1];
        var set = new HashSet<Integer>();
        for (int i = 0; i < len; i++) {
            leftSum[i + 1] = nums[i] + leftSum[i];
            rightSum[len - i - 1] = nums[len - i - 1] + rightSum[len - i];
            if (nums[i] == 0) {
                set.add(i);
            }
        }
        var ans = 0;
        for (Integer i : set) {
            if (leftSum[i + 1] == rightSum[i]) {
                ans += 2;
            } else if (Math.abs(leftSum[i + 1] - rightSum[i]) == 1) {
                ans += 1;
            }
        }
        return ans;
    }
}
