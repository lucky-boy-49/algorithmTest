package org.example.zhongdeng;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 3169. 无需开会的工作日
 */
public class S3169 {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
        int l = 0, r = 0, max = meetings[0][1];
        for (;r < meetings.length - 1; r++) {
            if (meetings[r + 1][0] > max) {
                days -= max - meetings[l][0] + 1;
                l = r + 1;
                max = meetings[r + 1][1];
            } else {
                max = Math.max(max, meetings[r + 1][1]);
            }
        }
        max = Math.max(max, meetings[r][1]);
        return days - (max - meetings[l][0] + 1);
    }
}
