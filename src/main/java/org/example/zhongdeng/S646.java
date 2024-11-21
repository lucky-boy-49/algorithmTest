package org.example.zhongdeng;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 646. 最长数对链
 */
public class S646 {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[1]));
        int right = pairs[0][1], ans = 0;
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > right){
                ans++;
                right = pairs[i][1];
            }
        }
        return ans + 1;
    }
}
