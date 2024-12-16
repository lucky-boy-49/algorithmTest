package org.example.kunnan;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * 1847. 最近的房间
 */
public class S1847 {
    public int[] closestRoom(int[][] rooms, int[][] queries) {
        int n = rooms.length, k = queries.length, index = n - 1;
        int[][] ans = new int[k][];
        for (int i = 0; i < k; i++) {
            ans[i] = new int[]{queries[i][0], queries[i][1], i};
        }
        Arrays.sort(rooms, Comparator.comparingInt(o -> o[1]));
        Arrays.sort(ans, Comparator.comparingInt(o -> o[1]));
        int[] res = new int[k];
        Arrays.fill(res, -1);
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = k - 1; i >= 0; i--) {
            while (index >= 0 && ans[i][1] <= rooms[index][1]) {
                set.add(rooms[index--][0]);
            }
            Integer floor = set.floor(ans[i][0]);
            Integer ceiling = set.ceiling(ans[i][0]);
            if (floor != null && ceiling != null) {
                if (Math.abs(ans[i][0] - floor) <= Math.abs(ans[i][0] - ceiling)) {
                    res[ans[i][2]] = floor;
                } else {
                    res[ans[i][2]] = ceiling;
                }
            }
            if (floor == null && ceiling != null) res[ans[i][2]] = ceiling;
            if (ceiling == null && floor != null) res[ans[i][2]] = floor;
        }
        return res;
    }
}
