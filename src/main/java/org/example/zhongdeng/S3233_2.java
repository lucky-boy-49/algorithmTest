package org.example.zhongdeng;

import java.util.ArrayList;
import java.util.List;

public class S3233_2 {
    private static final List<Integer> primePower = new ArrayList<>();
    private static final int n;

    static {
        // 方法一:埃式筛
        int MAX = 31623;
        boolean[] np = new boolean[MAX + 1];
        for (int i = 2; i <= MAX; i++) {
            if (!np[i]) {
                // 质数
                primePower.add(i * i);
                int a;
                for (int j = i; (a = i * j) <= MAX; j++) {
                    np[a] = true;
                }
            }
        }
        n = primePower.size();
    }

    public int nonSpecialCount(int l, int r) {
        // 1)  >=6 的偶数一定不是特殊数字 至少有1，2 和 n/2 3个真因数
        // 2)  质数一定不是特殊数字, 只有1个真因数
        // 1 2 3 4 5 中  只有 4 是 特殊数字（2个真因素1, 2）
        // n 除了1以外只有一个真因子 a * a = n  a > 1  且 a是质数
        // 问题转化为[l,r]内不是质数平方数的个数
        // a * a >=l
        int t = binarySearch(-1, n, r + 1) - binarySearch(-1, n, l);
        return r - l + 1 - t;
    }

    // 返回 primeArr中 平方数>= t 的最小下标
    private int binarySearch(int l, int r, int t) {
        while (l + 1 < r) {
            int mid = l + (r - l) / 2;
            if (primePower.get(mid) >= t) {
                r = mid;
            } else {
                l = mid;
            }
        }
        return r;
    }
}
