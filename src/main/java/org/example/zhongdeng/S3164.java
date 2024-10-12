package org.example.zhongdeng;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class S3164 {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        int res = 0;
        Map<String, Integer> dp = new HashMap<>();
        Map<Integer, Integer> n = new HashMap<>();
        Map<Integer, Integer> m = new HashMap<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            if (i % k != 0) {
                continue;
            }
            n.compute(i, (key, val) -> val == null ? 1 : val + 1);
            set1.add(i);
        }
        for (int i : nums2) {
            m.compute(i, (key, val) -> val == null ? 1 : val + 1);
            set2.add(i);
        }
        for (int j : set1) {
            for (int value : set2) {
                String key = j + "_" + value;
                if (!dp.containsKey(key)) {
                    if (j % (value * k) == 0) {
                        int size = n.get(j) * m.get(value);
                        dp.put(key, size);
                        res += size;
                    } else {
                        dp.put(key, -1);
                    }
                } else if (dp.get(key) != -1) {
                    res += dp.get(key);
                }
            }
        }
        return res;
    }
}
