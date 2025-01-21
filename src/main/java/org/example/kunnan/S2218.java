package org.example.kunnan;

import java.util.List;

/**
 * 2218. 从栈中取出 K 个硬币的最大面值和
 */
public class S2218 {
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int[] dp = new int[k + 1];
        for (List<Integer> pile : piles) {
            for (int i = 1; i < pile.size(); i++) {
                pile.set(i, pile.get(i) + pile.get(i - 1));
            }
            for (int j = k; j > 0; j--) {
                for (int i = 0; i < pile.size(); i++) {
                    if (i + 1 <= j) {
                        dp[j] = Math.max(dp[j], dp[j - i - 1] + pile.get(i));
                    }
                }
            }
        }
        return dp[k];
    }

    public int maxValueOfCoins2(List<List<Integer>> piles, int k) {
        // 获取硬币堆的数量
        int n = piles.size();
        // 创建一个二维数组 dp，用于存储中间结果。
        // dp[i][j] 表示从前 i+1 个硬币堆中选择 j 个硬币的最大价值
        // 使用滚动数组优化空间复杂度，只需要两个状态即可交替使用
        int[][] dp = new int[2][k + 1];

        // 初始化第一个硬币堆的选择情况
        int sum = 0; // 当前选中的硬币总价值
        int cnt = 0; // 当前选中的硬币数量
        dp[0][0] = 0; // 不选任何硬币时的价值为 0

        // 遍历第一个硬币堆的所有硬币
        for (int coin : piles.get(0)) {
            sum += coin; // 累加当前硬币的价值
            cnt += 1; // 增加选中的硬币数量
            if (cnt <= k) { // 如果选中的硬币数量不超过限制 k
                dp[0][cnt] = sum; // 更新 dp 数组，记录当前选中的硬币总数对应的最大价值
            } else {
                break; // 如果超过限制，则停止遍历
            }
        }

        // 对于超出限制 k 的选法，设置其价值为 -1 表示无效
        while (++cnt <= k) {
            dp[0][cnt] = -1;
        }

        // 处理剩余的硬币堆
        for (int i = 1; i < n; ++i) {
            // 计算当前使用的 dp 状态索引
            int pi = (i - 1) & 1; // 上一轮的状态索引
            int ci = i & 1; // 当前轮的状态索引

            // 将上一轮的结果复制到本轮的状态中
            if (k + 1 >= 0) System.arraycopy(dp[pi], 0, dp[ci], 0, k + 1);

            sum = 0; // 重置当前选中的硬币总价值
            cnt = 0; // 重置当前选中的硬币数量

            // 遍历第 i 个硬币堆的所有硬币
            for (int coin : piles.get(i)) {
                sum += coin; // 累加当前硬币的价值
                cnt += 1; // 增加选中的硬币数量

                if (cnt > k) { // 如果选中的硬币数量超过限制 k，则停止遍历
                    break;
                }

                // 更新 dp 数组，记录从前 i+1 个硬币堆中选择 cnt 个硬币的最大价值
                dp[ci][cnt] = Math.max(dp[ci][cnt], sum);

                // 考虑从前 i 个硬币堆中选择 j-cnt 个硬币的情况
                for (int j = cnt + 1; j <= k; ++j) {
                    if (dp[pi][j - cnt] != -1) { // 如果从前 i 个硬币堆中选择 j-cnt 个硬币是有效的
                        // 更新 dp 数组，考虑从前 i+1 个硬币堆中选择 j 个硬币的最大价值
                        dp[ci][j] = Math.max(dp[ci][j], dp[pi][j - cnt] + sum);
                    } else {
                        break; // 如果从前 i 个硬币堆中选择 j-cnt 个硬币是无效的，则停止遍历
                    }
                }
            }
        }

        // 返回从前 n 个硬币堆中选择 k 个硬币的最大价值
        return dp[(n - 1) & 1][k];
    }
}
