package org.example.jiandan;

/**
 * 3375. 使数组的值全部为 K 的最少操作次数
 */
public class S3375 {
    public int minOperations(int[] nums, int k) {
        int ans = 0;
        boolean f = true;
        boolean[] flag = new boolean[101];
        for (int num : nums) {
            if (num > k && !flag[num]) {
                ans++;
                flag[num] = true;
            }
            if (num < k) {
                f = false;
            }
        }
        return f ? ans : -1;
    }
}
