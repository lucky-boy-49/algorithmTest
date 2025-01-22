package org.example.zhongdeng;

import java.util.Arrays;

/**
 * 1561. 你可以获得的最大硬币数目
 */
public class S1561 {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int res = 0, i = piles.length - 2, size = (piles.length - 1) / 3;
        while (i > size) {
            res += piles[i];
            i -= 2;
        }
        return res;
    }
}
