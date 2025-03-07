package org.example.zhongdeng;

import java.util.HashMap;
import java.util.Map;

/**
 * 2597. 美丽子集的数目
 */
public class S2597 {
    private int ans = -1; // 去掉空集

    public int beautifulSubsets(int[] nums, int k) {
        Map<Integer, Integer> cnt = new HashMap<>();
        dfs(0, nums, k, cnt);
        return ans;
    }

    // nums[i] 选或不选
    private void dfs(int i, int[] nums, int k, Map<Integer, Integer> cnt) {
        if (i == nums.length) {
            ans++;
            return;
        }
        dfs(i + 1, nums, k, cnt); // 不选
        int x = nums[i];
        if (cnt.getOrDefault(x - k, 0) == 0 && cnt.getOrDefault(x + k, 0) == 0) { // 可以选
            cnt.merge(x, 1, Integer::sum); // 选
            dfs(i + 1, nums, k, cnt); // 讨论 nums[i+1] 选或不选
            cnt.merge(x, -1, Integer::sum); // 撤销，恢复现场
        }
    }
}
