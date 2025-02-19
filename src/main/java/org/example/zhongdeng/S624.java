package org.example.zhongdeng;

import java.util.List;

/**
 * 624. 数组列表中的最大距离
 */
public class S624 {
    public int maxDistance(List<List<Integer>> arrays) {
        if (arrays.isEmpty()) {
            return 0;
        }
        int res = 0, max = arrays.getFirst().getLast(), min = arrays.getFirst().getFirst();
        for (int i = 1; i < arrays.size(); i++) {
            int min2 = arrays.get(i).getFirst();
            int max2 = arrays.get(i).getLast();
            res = Math.max(res, Math.abs(max2 - min));
            res = Math.max(res, Math.abs(max - min2));
            max = Math.max(max, max2);
            min = Math.min(min, min2);
        }
        return res;
    }
}
