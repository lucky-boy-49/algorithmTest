package org.example.zhongdeng;

/**
 * 2270. 分割数组的方案数
 */
public class S2270 {
    public int waysToSplitArray(int[] nums) {
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int ans = 0;
        long left = 0, right = sum;
        for (int i = 0; i < nums.length - 1; i++) {
            left += nums[i];
            right -= nums[i];
            if (left >= right) {
                ans++;
            }
        }
        return ans;
    }
}
