package org.example.zhongdeng;

public class S172 {
    public int trailingZeroes(int n) {
        int c1 = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i % Math.pow(5, j) == 0) {
                    c1++;
                }
            }
        }
        return c1;
    }

    public int trailingZeroes2(int n) {
        int res = 0;
        while (n >= 5) {
            res += n / 5;
            n /= 5;
        }
        return res;
    }

}
