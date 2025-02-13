package org.example.jiandan;

/**
 * 1742. 盒子中小球的最大数量
 */
public class S1742 {
    public int countBalls(int lowLimit, int highLimit) {
        int count = 0, size = 0, tmp = highLimit;
        while (tmp > 0) {
            size += 9;
            tmp /= 10;
        }
        int[] dp = new int[size + 1];
        while (lowLimit <= highLimit) {
            size = 0;
            tmp = lowLimit++;
            while (tmp > 0) {
                size += tmp % 10;
                tmp /= 10;
            }
            dp[size]++;
            count = Math.max(count, dp[size]);
        }
        return count;
    }
}
