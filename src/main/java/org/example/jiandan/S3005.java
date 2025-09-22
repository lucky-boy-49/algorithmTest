package org.example.jiandan;

/**
 * 3005. 最大频率元素计数
 */
public class S3005 {
    public int maxFrequencyElements(int[] nums) {
        var sum = new int[101];
        var maxSum = 0;
        var count = 0;
        for (int num : nums) {
            sum[num]++;
            if (sum[num] == maxSum) {
                count++;
            } else if (sum[num] > maxSum) {
                maxSum = sum[num];
                count = 1;
            }
        }
        return maxSum * count;
    }
}
