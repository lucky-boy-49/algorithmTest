package org.example.zhongdeng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2610. 转换二维数组
 */
public class S2610 {
    public List<List<Integer>> findMatrix(int[] nums) {
        int maxSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
            maxSum = Math.max(maxSum, map.get(num));
        }
        List<List<Integer>> ans = new ArrayList<>();
        while (maxSum-- > 0) {
            List<Integer> item = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 0) {
                    item.add(entry.getKey());
                    map.merge(entry.getKey(), -1, Integer::sum);
                }
            }
            ans.add(item);
        }
        return ans;
    }
}
