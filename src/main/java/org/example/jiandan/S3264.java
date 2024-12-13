package org.example.jiandan;

/**
 * 3264. K 次乘运算后的最终数组 I
 */
public class S3264 {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int min = nums[0], index = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    index = j;
                }
            }
            nums[index] *= multiplier;
        }
        return nums;
    }
}
