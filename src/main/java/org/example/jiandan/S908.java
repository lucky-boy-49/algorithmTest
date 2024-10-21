package org.example.jiandan;

public class S908 {
    public int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min <= 2 * k ? 0 : max - min - 2 * k;
    }
}
