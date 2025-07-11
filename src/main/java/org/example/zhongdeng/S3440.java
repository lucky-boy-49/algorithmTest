package org.example.zhongdeng;

import java.util.TreeMap;

/**
 * 3440. 重新安排会议得到最多空余时间 II
 */
public class S3440 {
    public int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {
        int ans = 0, n = startTime.length, p = startTime[0];
        TreeMap<Integer, Integer> map = new TreeMap<>();

        map.merge(startTime[0], 1, Integer::sum);
        for (int i = 1; i < n; i++) {
            int t = startTime[i] - endTime[i - 1];
            map.merge(t, 1, Integer::sum);
        }
        map.merge(eventTime - endTime[n - 1], 1, Integer::sum);

        for (int i = 1; i <= n; i++) {
            int del = endTime[i - 1] - startTime[i - 1];
            int ne;
            if (i == n) {
                ne = eventTime - endTime[i - 1];
            } else {
                ne = startTime[i] - endTime[i - 1];
            }
            map.computeIfPresent(ne, (k, v) -> v - 1 > 0 ? v - 1 : null);
            map.computeIfPresent(p, (k, v) -> v - 1 > 0 ? v - 1 : null);
            if (map.lastKey() >= del) { // del 可以放在其他位置
                ans = Math.max(ans, ne + p);
                ans = Math.max(p + ne + del, ans);
            } else {
                ans = Math.max(ans, ne + p);
            }
            map.merge(ne, 1, Integer::sum);
            map.merge(p, 1, Integer::sum);
            p = ne;
        }

        return ans;
    }
}
