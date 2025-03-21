package org.example.zhongdeng;

/**
 * 2680. 最大或值
 */
public class S2680 {
    public long maximumOr(int[] nums, int k) {
        int length = nums.length;
        long[] pre = new long[length + 1];
        pre[1] = nums[0];
        long[] next = new long[length + 1];
        next[length - 1] = nums[length - 1];
        for (int i = 1; i < length; i++) {
            pre[i + 1] = nums[i] | pre[i];
            next[length - i - 1] = nums[length - 1 - i] | next[length - i];
        }
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            long num = (long) nums[i] << k;
            ans = Math.max(ans, pre[i] | num | next[i + 1]);
        }
        return ans;
    }
}
