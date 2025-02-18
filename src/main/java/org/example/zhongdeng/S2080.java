package org.example.zhongdeng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2080. 区间内查询数字的频率
 */
public class S2080 {
    private final Map<Integer, List<Integer>> map = new HashMap<>();

    public S2080(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.get(arr[i]).add(i);
            } else {
                List<Integer> newList = new ArrayList<>(arr.length / 2);
                newList.add(i);
                map.put(arr[i], newList);
            }
        }
    }

    public int query(int left, int right, int value) {
        if (!map.containsKey(value)) {
            return 0;
        }
        List<Integer> list = map.get(value);
        int l = 0, r = list.size() - 1, lN = 0, rN = list.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (list.get(m) < left) {
                l = m + 1;
                lN = l;
            } else if (list.get(m) > left) {
                r = m - 1;
            } else {
                lN = m;
                break;
            }
        }
        l = 0;
        r = list.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (list.get(m) < right) {
                l = m + 1;
            } else if (list.get(m) > right) {
                r = m - 1;
                rN = r;
            } else {
                rN = m;
                break;
            }
        }
        return rN < lN ? 0 : rN - lN + 1;
    }

}
