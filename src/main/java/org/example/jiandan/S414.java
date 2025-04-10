package org.example.jiandan;

/**
 * 414. 第三大的数
 */
public class S414 {
    public int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        long size1 = Long.MIN_VALUE, size2 = Long.MIN_VALUE, size3 = Long.MIN_VALUE;
        for (int num : nums) {
            if (num > size1) {
                size3 = size2;
                size2 = size1;
                size1 = num;
            } else if (num > size2 && num != size1) {
                size3 = size2;
                size2 = num;
            } else if (num > size3 && num != size2 && num != size1) {
                size3 = num;
            }
        }
        return (int) (size3 != Long.MIN_VALUE ? size3 : size1);
    }
}
