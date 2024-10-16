package org.example.jiandan;

import java.util.Arrays;

public class S3194 {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double average = Double.MAX_VALUE;
        for (int i = 0; i < nums.length / 2; i++) {
            int min = nums[i];
            int max = nums[nums.length - 1 - i];
            average = Math.min(average, (double) (min + max) / 2);
        }
        return average;
    }
}
