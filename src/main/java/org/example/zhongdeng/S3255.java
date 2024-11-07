package org.example.zhongdeng;

public class S3255 {
    public int[] resultsArray(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = i == 0 || nums[i] - nums[i - 1] != 1 ? 1 : count + 1;
            if (count >= k) {
                result[i - k + 1] = nums[i];
            } else if (i >= k - 1) {
                result[i - k + 1] = -1;
            }
        }
        return result;
    }
}
