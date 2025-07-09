package org.example.zhongdeng;

/**
 * 3439. 重新安排会议得到最多空余时间 I
 */
public class S3439 {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int res = 0, max = 0, i = 0, j = 0;
        while (j <= k && j < startTime.length) {
            if (j == 0) {
                max += startTime[j];
            } else {
                max += startTime[j] - endTime[j - 1];
            }
            j++;
        }
        if (j != k + 1) {
            max += eventTime - endTime[j - 1];
            res = Math.max(res, max);
            return res;
        }
        res = Math.max(res, max);
        while (j < startTime.length) {
            if (i == 0) {
                max -= startTime[i];
            } else {
                max -= startTime[i] - endTime[i - 1];
            }
            max += startTime[j] - endTime[j - 1];
            res = Math.max(res, max);
            j++;
            i++;
        }
        if (endTime[j - 1] != eventTime) {
            if (i == 0) {
                max -= startTime[i];
            } else {
                max -= startTime[i] - endTime[i - 1];
            }
            max += eventTime - endTime[j - 1];
            res = Math.max(res, max);
        }
        return res;
    }
}
