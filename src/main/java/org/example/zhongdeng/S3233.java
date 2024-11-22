package org.example.zhongdeng;

public class S3233 {
    public int nonSpecialCount(int l, int r) {
        int count = 0;
        for (int i = (int) Math.sqrt(Math.max(l, 4)); i <= Math.sqrt(r); i++) {
            int size = i * i;
            if (size >= l && size <= r) {
                if (isZhiShu(i)) {
                    count++;
                }
            }
        }
        return r - l - count + 1;
    }

    private boolean isZhiShu(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
