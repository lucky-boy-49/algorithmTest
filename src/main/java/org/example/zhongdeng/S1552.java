package org.example.zhongdeng;

import java.util.Arrays;

/**
 * 1552. 两球之间的磁力
 */
public class S1552 {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left = 1, right = position[position.length - 1];
        while (left < right) {
            int mid = (left + right + 1) >> 1;
            if (check(position, mid, m)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    private boolean check(int[] position, int mid, int m) {
        int pre = position[0];
        int cnt = 1;
        for (int i = 1; i < position.length; ++i) {
            if (position[i] - pre >= mid) {
                ++cnt;
                pre = position[i];
            }
        }
        return cnt >= m;
    }
}
