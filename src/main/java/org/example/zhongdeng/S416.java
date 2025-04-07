package org.example.zhongdeng;

/**
 * 416. 分割等和子集
 */
public class S416 {
    public boolean canPartition(int[] nums) {
        if (nums.length == 1) {
            return false;
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // 如果总和是奇数，则无法分割为两个等和子集
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        // 初始化，和为0总是可能的，即不选择任何元素
        dp[0] = true;
        // 遍历每个数字
        for (int num : nums) {
            // 逆序遍历目标值，避免重复使用同一个数字
            for (int j = target; j >= num; j--) {
                if (dp[j - num]) {
                    // 如果dp[j - num]为true，那么dp[j]也应该是true
                    dp[j] = true;
                }
            }
        }
        return dp[target];
    }
}
