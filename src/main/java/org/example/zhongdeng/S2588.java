package org.example.zhongdeng;

import java.util.HashMap;
import java.util.Map;

/**
 * 2588. 统计美丽子数组数目
 */
public class S2588 {
    public long beautifulSubarrays(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        long res = 0;
        int flag = 0;
        map.put(0, 1);
        for (int num : nums) {
            flag ^= num;
            res += map.getOrDefault(flag, 0);
            map.merge(flag, 1, (o, n) -> ++o);
        }
        return res;
    }
}
