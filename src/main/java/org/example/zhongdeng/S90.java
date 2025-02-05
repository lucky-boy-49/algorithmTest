package org.example.zhongdeng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 90. 子集 II
 */
public class S90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> rst = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, 0, new ArrayList<>(), rst);
        return rst;
    }

    private void dfs(int[] nums, int index, List<Integer> preArr, List<List<Integer>> rst) {
        rst.add(preArr);
        if (index == nums.length) {
            return;
        }
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            List<Integer> copyArr = new ArrayList<>(preArr);
            copyArr.add(nums[i]);
            dfs(nums, i + 1, copyArr, rst);
        }
    }
}
