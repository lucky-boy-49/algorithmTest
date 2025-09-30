package org.example.zhongdeng;

/**
 * 2221. 数组的三角和
 */
public class S2221 {
    public int triangularSum(int[] nums) {
        while (nums.length > 1) {
            var newNums = new int[nums.length - 1];
            for (int i = 0; i < newNums.length; i++) {
                newNums[i] = (nums[i] + nums[i + 1]) % 10;
            }
            nums = newNums;
        }
        return nums[0];
    }
}
