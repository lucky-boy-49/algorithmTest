package org.example.zhongdeng;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class S3243_2 {
    int[] h, ne, e;
    int idx;
    private void add(int a, int b){
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        int len = queries.length;
        h = new int[n];
        ne = new int[len + n];
        e = new int[len + n];
        Arrays.fill(h, -1);
        for(int i = 1; i < n; i++){
            add(i - 1, i);
        }
        // 距离表
        int[] dist = new int[n];
        Arrays.fill(dist, 0x3f3f3f3f);
        dist[0] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        while(!q.isEmpty()){
            int cur = q.poll();
            for(int i = h[cur]; i != -1; i = ne[i]){
                int j = e[i];
                dist[j] = Math.min(dist[j], dist[cur] + 1);
                q.offer(j);
            }
        }
        int[] res = new int[len];
        for(int i = 0; i < len; i++){
            int u = queries[i][0], v = queries[i][1];
            add(u, v);
            if(dist[v] > dist[u] + 1){
                dist[v] = dist[u] + 1;
                q.offer(v);
                while(!q.isEmpty()){
                    int cur = q.poll();
                    for(int j = h[cur]; j != -1; j = ne[j]){
                        int k = e[j];
                        if(dist[k] > dist[cur] + 1){
                            dist[k] = dist[cur] + 1;
                            q.offer(k);
                        }
                    }
                }
            }
            res[i] = dist[n - 1];
        }
        return res;
    }
}
