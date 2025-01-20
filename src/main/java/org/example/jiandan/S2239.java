package org.example.jiandan;

/**
 * 2239. 找到最接近 0 的数字
 */
public class S2239 {
    public int findClosestNumber(int[] nums) {
        int ans = Integer.MAX_VALUE, size = Integer.MAX_VALUE;
        for (int num : nums) {
            int abs = Math.abs(num);
            if (size > abs) {
                ans = num;
                size = abs;
            } else if (size == abs && ans < num) {
                ans = num;
            }
        }
        return ans;
    }
}
