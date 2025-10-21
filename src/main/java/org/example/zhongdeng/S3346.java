package org.example.zhongdeng;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 3346. 执行操作后元素的最高频率 I
 */
public class S3346 {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        var cnt = new HashMap<Integer, Integer>();
        var diff = new TreeMap<Integer, Integer>();
        for (int x : nums) {
            cnt.merge(x, 1, Integer::sum); // cnt[x]++
            diff.putIfAbsent(x, 0); // 把 x 插入 diff，以保证下面能遍历到 x
            // 把 [x-k, x+k] 中的每个整数的出现次数都加一
            diff.merge(x - k, 1, Integer::sum); // diff[x-k]++
            diff.merge(x + k + 1, -1, Integer::sum); // diff[x+k+1]--
        }

        var ans = 0;
        var sumD = 0;
        for (Map.Entry<Integer, Integer> e : diff.entrySet()) {
            sumD += e.getValue();
            ans = Math.max(ans, Math.min(sumD, cnt.getOrDefault(e.getKey(), 0) + numOperations));
        }
        return ans;
    }
}
