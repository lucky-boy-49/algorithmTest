package org.example.kunnan;

/**
 * 3219. 切蛋糕的最小总开销 II
 */
public class S3219 {
    public long minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        int max = 0;
        for (int h : horizontalCut) {
            max = Math.max(max, h);
        }
        for (int v : verticalCut) {
            max = Math.max(v, max);
        }
        int[] hCount = new int[max + 1];
        int[] vCount = new int[max + 1];
        for (int h : horizontalCut) {
            hCount[h]++;
        }
        for (int v : verticalCut) {
            vCount[v]++;
        }
        long ans = 0;
        int h = 1, v = 1;
        for (int i = max; i > 0; i--) {
            ans += (long) hCount[i] * i * h;
            v += hCount[i];
            ans += (long) vCount[i] * i * v;
            h += vCount[i];
        }
        return ans;
    }
}
