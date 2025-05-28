package org.example.zhongdeng;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class S3372 {
    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
        int n = edges1.length;
        int m = edges2.length;
        Map<Integer, List<Integer>> edgesMap1 = new HashMap<>(n);
        Map<Integer, List<Integer>> edgesMap2 = new HashMap<>(m);
        getEdgesMap(edges1, edgesMap1);
        getEdgesMap(edges2, edgesMap2);
        int[] res = new int[n + 1];
        int max = 0;
        for (int i = 0; i < m + 1; i++) {
            max = Math.max(max, dfs(edgesMap2, k - 1, 0, i, -1));
        }
        for (int i = 0; i < res.length; i++) {
            res[i] = dfs(edgesMap1, k, 0, i, -1) + max;
        }
        return res;
    }

    private void getEdgesMap(int[][] edges, Map<Integer, List<Integer>> edgesMap) {
        for (int[] ints : edges) {
            List<Integer> list = new LinkedList<>();
            list.add(ints[1]);
            edgesMap.merge(ints[0], list, (o, v) -> {
                o.addAll(v);
                return o;
            });
            list = new LinkedList<>();
            list.add(ints[0]);
            edgesMap.merge(ints[1], list, (o, v) -> {
                o.addAll(v);
                return o;
            });
        }
    }

    private int dfs(Map<Integer, List<Integer>> edgesMap, int k, int level, int key, int pre) {
        if (k < 0) {
            return 0;
        }
        int count = 1;
        List<Integer> list = edgesMap.get(key);
        if (list != null && level + 1 <= k) {
            for (Integer i : list) {
                if (pre != i) {
                    count += dfs(edgesMap, k, level + 1, i, key);
                }
            }
        }
        return count;
    }
}
