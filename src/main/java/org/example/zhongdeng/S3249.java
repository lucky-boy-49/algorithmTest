package org.example.zhongdeng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 3249. 统计好节点的数目
 */
public class S3249 {
    private int res = 0;
    boolean[] dp;
    public int countGoodNodes(int[][] edges) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] edge : edges) {
            map.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            map.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
        }
        dp = new boolean[map.size()];
        dfs(map, 0);
        return res;
    }
    private int dfs(Map<Integer, List<Integer>> map, int node) {
        dp[node] = true;
        List<Integer> nodeList = map.get(node);
        int i = 0;
        int fistNodeNum = 0;
        for (i = 0; i < nodeList.size(); i++) {
            if (!dp[nodeList.get(i)]) {
                fistNodeNum = dfs(map, nodeList.get(i));
                break;
            }
        }
        if (i == nodeList.size()) {
            res++;
            return 1;
        }
        int sum = 0;
        sum += fistNodeNum;
        boolean flag = true;
        for (i += 1; i < nodeList.size(); i++) {
            if (!dp[nodeList.get(i)]) {
                int nodeNum = dfs(map, nodeList.get(i));
                flag = nodeNum == fistNodeNum && flag;
                sum += nodeNum;
            }
        }
        if (flag) {
            res++;
        }
        return sum + 1;
    }
}
