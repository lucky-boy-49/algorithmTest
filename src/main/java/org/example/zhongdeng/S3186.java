package org.example.zhongdeng;

import java.util.Arrays;

/**
 * 3186. 施咒的最大总伤害
 */
public class S3186 {
    public long maximumTotalDamage(int[] power) {
        var dp = new long[power.length][2];
        Arrays.sort(power);
        dp[0][0] = power[0];
        for (int i = 1; i < power.length; i++) {
            var j = power[i - 1] == power[i] ? i - 1 : find(power, power[i] - 2, i - 1);
            if (j >= 0 && power[j] == power[i]) {
                var k = find(power, power[j], power[i] - 2, j - 1);
                dp[i][0] = power[i] + Math.max(dp[j][0], k >= 0 ? Math.max(dp[k][0], dp[k][1]) : 0);
            } else {
                dp[i][0] = power[i] + (j >= 0 ? Math.max(dp[j][0], dp[j][1]) : 0);
            }
            dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][1]);
        }
        return Math.max(dp[dp.length - 1][0], dp[dp.length - 1][1]);
    }

    private int find(int[] power, int size, int right) {
        if (power[0] > size) {
            return -1;
        }
        if (power[right] < size) {
            return right;
        }
        var left = 0;
        var ans = -1;
        while (left <= right) {
            var mid = (right - left) / 2 + left;
            if (power[mid] >= size) {
                right = mid - 1;
            } else {
                left = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    private int find(int[] power, int size, int size2, int right) {
        if (right < 0) {
            return -1;
        }
        var newRight = -1;
        if (power[right] != size) {
            newRight = right;
        }
        if (newRight == -1) {
            var left = 0;
            while (left <= right) {
                var mid = (right - left) / 2 + left;
                if (power[mid] == size) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                    newRight = mid;
                }
            }
        }
        return find(power, size2, newRight);
    }

    public long maximumTotalDamage2(int[] power) {
        Arrays.sort(power);
        int l = power.length;
        int[] record = new int[l];
        Arrays.fill(record, -1);
        int idx = 0;
        int lastNum = power[0];
        for (int i = 1; i < l; i++) {
            if (lastNum != power[i]) {
                record[idx++] = i;
                lastNum = power[i];
            }
        }
        record[idx] = l;


        long ans = (long) record[0] * power[0];
        long[] m = new long[l];
        m[0] = ans;
        long[] preMax = new long[l];
        preMax[0] = ans;
        for (int i = 1; i < record.length && record[i] != -1; i++) {
            int i1 = record[i] - record[i - 1];
            m[i] = (long) i1 * power[record[i - 1]];
            for (int j = i - 1; j >= 0; j--) {
                if (power[record[i] - 1] - power[record[j] - 1] > 2) {
                    m[i] = (long) i1 * power[record[i - 1]] + preMax[j];
                    break;
                }
            }
            ans = Math.max(ans, m[i]);
            preMax[i] = ans;
        }
        return ans;
    }

}
