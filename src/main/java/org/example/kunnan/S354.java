package org.example.kunnan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 354. 俄罗斯套娃信封问题
 */
public class S354 {
    public int maxEnvelopes(int[][] envelopes) {
        envelopes = Arrays.stream(envelopes)
                .map(row -> Arrays.stream(row).boxed().map(Object::toString).collect(Collectors.joining(",")))
                .distinct()
                .map(row -> Arrays.stream(row.split(",")).mapToInt(Integer::parseInt).toArray())
                .sorted((a, b) -> {
                    if (a[0] == b[0]) return a[1] - b[1];
                    return a[0] - b[0];
                }).toArray(int[][]::new);
        int n = envelopes.length, maxLen = 0;
        int[] dp = new int[n];
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for (int i = 0; i < n; ++i) {
            dp[i] = 1;
            if (i > 0 && envelopes[i][0] != envelopes[i - 1][0]) {
                list.add(i);
            }
            for (Integer integer : list) {
                for (int k = integer; k < i; k++) {
                    if (envelopes[k][0] == envelopes[integer][0] && envelopes[i][0] > envelopes[k][0] &&
                            envelopes[i][1] > envelopes[k][1]) {
                        if (dp[k] + 1 > dp[i]) {
                            dp[i] = dp[k] + 1;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (dp[i] > maxLen) {
                maxLen = dp[i];
            }
        }
        return maxLen;
    }

    public int maxEnvelopes2(int[][] envelopes) {
        if (envelopes.length == 0) {
            return 0;
        }

        int n = envelopes.length;
        Arrays.sort(envelopes, (e1, e2) -> {
            if (e1[0] != e2[0]) {
                return e1[0] - e2[0];
            } else {
                return e2[1] - e1[1];
            }
        });

        int[] f = new int[n];
        Arrays.fill(f, 1);
        int ans = 1;
        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                if (envelopes[j][1] < envelopes[i][1]) {
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }
            ans = Math.max(ans, f[i]);
        }
        return ans;
    }

    public int maxEnvelopes3(int[][] es) {
        int n = es.length, ans = 1;
        if (n == 0) return n;
        // 由于我们使用了 g 记录高度，因此这里只需将 w 从小到达排序即可
        Arrays.sort(es, Comparator.comparingInt(a -> a[0]));
        // f(i) 为考虑前 i 个物品，并以第 i 个物品为结尾的最大值
        int[] f = new int[n];
        // g(i) 记录的是长度为 i 的最长上升子序列的最小「信封高度」
        int[] g = new int[n];
        // 因为要取 min，用一个足够大（不可能）的高度初始化
        Arrays.fill(g, Integer.MAX_VALUE);
        g[0] = 0;
        for (int i = 0, j = 0, len = 1; i < n; i++) {
            // 对于 w 相同的数据，不更新 g 数组
            if (es[i][0] != es[j][0]) {
                // 限制 j 不能越过 i，确保 g 数组中只会出现第 i 个信封前的「历史信封」
                while (j < i) {
                    int prev = f[j], cur = es[j][1];
                    if (prev == len) {
                        // 与当前长度一致了，说明上升序列多增加一位
                        g[len++] = cur;
                    } else {
                        // 始终保留最小的「信封高度」，这样可以确保有更多的信封可以与其行程上升序列
                        // 举例：同样是上升长度为 5 的序列，保留最小高度为 5 记录（而不是保留任意的，比如 10），这样之后高度为 7 8 9 的信封都能形成序列；
                        g[prev] = Math.min(g[prev], cur);
                    }
                    j++;
                }
            }

            // 二分过程
            // g[i] 代表的是上升子序列长度为 i 的「最小信封高度」
            int l = 0, r = len;
            while (l < r) {
                int mid = l + r >> 1;
                // 令 check 条件为 es[i][1] <= g[mid]（代表 w 和 h 都严格小于当前信封）
                // 这样我们找到的就是满足条件，最靠近数组中心点的数据（也就是满足 check 条件的最大下标）
                // 对应回 g[] 数组的含义，其实就是找到 w 和 h 都满足条件的最大上升长度
                if (es[i][1] <= g[mid]) r = mid;
                else l = mid + 1;
            }
            // 更新 f[i] 与答案
            f[i] = r;
            ans = Math.max(ans, f[i]);
        }
        return ans;
    }
}
