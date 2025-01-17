package org.example.zhongdeng;

/**
 * 3097. 或值至少为 K 的最短子数组 II
 */
public class S3097 {
    public int minimumSubarrayLength(int[] nums, int k) {
        int length = nums.length, min = length + 1, ans = 0, l = 0, r = 0;
        while (r < length) {
            ans |= nums[r];
            if (ans >= k) {
                int tmp = 0, pre;
                for (int i = r; i >= l || r - i <= 32; i--) {
                    pre = tmp;
                    tmp |= nums[i];
                    if (tmp >= k) {
                        min = Math.min(min, r - i + 1);
                        l = i + 1;
                        ans = pre;
                        break;
                    }
                }
            }
            r++;
        }
        return min == length + 1 ? -1 : min;
    }
}
