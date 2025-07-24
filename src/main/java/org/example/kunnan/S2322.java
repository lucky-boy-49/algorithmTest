package org.example.kunnan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2322. 从树中删除边的最小分数
 */
public class S2322 {
    public int minimumScore(int[] nums, int[][] edges) {
        int n = nums.length;
        List<Integer>[] g = new ArrayList[n];
        Arrays.setAll(g, _ -> new ArrayList<>());
        for (int[] e : edges) {
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }

        int[] xor = new int[n];
        int[] in = new int[n];
        int[] out = new int[n];
        dfs(0, -1, g, nums, xor, in, out);

        int ans = Integer.MAX_VALUE;
        // 枚举：删除 x 与 x 父节点之间的边，删除 y 与 y 父节点之间的边
        for (int x = 2; x < n; x++) {
            for (int y = 1; y < x; y++) {
                int a, b, c;
                if (isAncestor(x, y, in, out)) { // x 是 y 的祖先
                    a = xor[y];
                    b = xor[x] ^ a;
                    c = xor[0] ^ xor[x];
                } else if (isAncestor(y, x, in, out)) { // y 是 x 的祖先
                    a = xor[x];
                    b = xor[y] ^ a;
                    c = xor[0] ^ xor[y];
                } else { // x 和 y 分别属于两棵不相交的子树
                    a = xor[x];
                    b = xor[y];
                    c = xor[0] ^ a ^ b;
                }
                ans = Math.min(ans, Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c));
                if (ans == 0) { // 不可能变小
                    return 0; // 提前返回
                }
            }
        }
        return ans;
    }

    private int clock = 0;

    private void dfs(int node, int fa, List<Integer>[] g, int[] nums, int[] xor, int[] in, int[] out) {
        in[node] = ++clock; // 递
        xor[node] = nums[node];
        for (int nextNode : g[node]) {
            if (nextNode != fa) {
                dfs(nextNode, node, g, nums, xor, in, out);
                xor[node] ^= xor[nextNode];
            }
        }
        out[node] = clock; // 归
    }

    // 判断 a 是否为 b 的祖先
    private boolean isAncestor(int a, int b, int[] in, int[] out) {
        return in[a] < in[b] && in[b] <= out[a];
    }
}
