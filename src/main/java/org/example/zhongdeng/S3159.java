package org.example.zhongdeng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 3159. 查询数组中元素的出现位置
 */
public class S3159 {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int[] res = new int[queries.length];
        Arrays.fill(res, -1);
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < queries.length; i++) {
            if (map.containsKey(queries[i])) {
                map.get(queries[i]).add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(queries[i], list);
            }
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                sum++;
                if (map.containsKey(sum)) {
                    for (Integer integer : map.get(sum)) {
                        res[integer] = i;
                    }

                }
            }
        }
        return res;
    }

    public int[] occurrencesOfElement2(int[] nums, int[] queries, int x) {
        int[] res = new int[queries.length];
        int[] dp = new int[nums.length + 1];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                sum++;
                dp[sum] = i + 1;
            }
        }
        for (int i = 0; i < queries.length; i++) {
            if (queries[i] >= 0 && queries[i] <= nums.length && dp[queries[i]] != 0) {
                res[i] = dp[queries[i]] - 1;
            } else {
                res[i] = -1;
            }
        }
        return res;
    }

}
