package org.example.zhongdeng;

/**
 * 2712. 使所有字符相等的最小成本
 */
public class S2712 {
    public long minimumCost(String s) {
        char[] chars = s.toCharArray();
        long[] preDp = new long[chars.length];
        long[] sufDp = new long[chars.length];
        for (int i = 1, j = chars.length - 2; i < chars.length && j >= 0; i++, j--) {
            if (chars[i] == chars[i - 1]) {
                preDp[i] = preDp[i - 1];
            } else {
                preDp[i] = preDp[i - 1] + i;
            }
            if (chars[j] == chars[j + 1]) {
                sufDp[j] = sufDp[j + 1];
            } else {
                sufDp[j] = sufDp[j + 1] + chars.length - j - 1;
            }
        }
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < chars.length; i++) {
            ans = Math.min(ans, preDp[i] + sufDp[i]);
        }
        return ans;
    }
}
