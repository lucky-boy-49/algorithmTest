package org.example.zhongdeng;

/**
 * 2275. 按位与结果大于零的最长组合
 */
public class S2275 {
    public int largestCombination(int[] candidates) {
        int mx = 0;
        for (int x : candidates) {
            mx = Math.max(mx, x);
        }
        int m = 32 - Integer.numberOfLeadingZeros(mx);
        int ans = 0;
        for (int i = 0; i < m; i++) {
            int temp = 0;
            for (int candidate : candidates) {
                temp += (candidate >> i) & 1;
            }
            ans = Math.max(ans, temp);
        }
        return ans;
    }
}
