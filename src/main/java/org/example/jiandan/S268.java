package org.example.jiandan;

/**
 * 268. 丢失的数字
 */
public class S268 {
    public int missingNumber(int[] nums) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
            result ^= i;
        }
        return result;
    }
}
