package org.example.zhongdeng;

import java.util.Arrays;

/**
 * 2274. 不含特殊楼层的最大连续楼层数
 */
public class S2274 {
    public int maxConsecutive(int bottom, int top, int[] special) {
        int result = 0;
        Arrays.sort(special);
        result = Math.max(result, special[0] - bottom);
        result = Math.max(result, top - special[special.length - 1]);
        for (int i = 1; i <= special.length - 1; i++) {
            result = Math.max(result, special[i] - special[i - 1] - 1);
        }
        return result;
    }
}
