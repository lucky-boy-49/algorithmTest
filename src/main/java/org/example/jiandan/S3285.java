package org.example.jiandan;

import java.util.LinkedList;
import java.util.List;

/**
 * 3285. 找到稳定山的下标
 */
public class S3285 {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> res = new LinkedList<>();
        for (int i = 1; i < height.length; i++) {
            if (height[i - 1] > threshold) {
                res.add(i);
            }
        }
        return res;
    }
}
