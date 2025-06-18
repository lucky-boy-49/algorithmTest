package org.example.zhongdeng;

import java.util.Arrays;

/**
 * 2966. 划分数组并满足最大差限制
 */
public class S2966 {
    private int getIndex(int[] nums, int i) {
        while (i < nums.length && nums[i] == -1) {
            i++;
        }
        return i;
    }

    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int size = nums.length / 3;
        int[][] ans = new int[size][3];
        int i = 0;
        for (int j = 0; j < ans.length; j++) {
            // 第一个数
            i = getIndex(nums, i);
            ans[j][0] = nums[i];
            nums[i++] = -1;

            // 第二个数
            i = getIndex(nums, i);
            if (nums[i] - ans[j][0] > k) {
                return new int[][]{};
            } else {
                ans[j][1] = nums[i];
            }
            nums[i++] = -1;

            // 第三个数
            i = getIndex(nums, i);
            if (nums[i] - ans[j][0] > k || nums[i] - ans[j][1] > k) {
                return new int[][]{};
            } else {
                ans[j][2] = nums[i];
            }
            nums[i++] = -1;
        }
        return ans;
    }
}
