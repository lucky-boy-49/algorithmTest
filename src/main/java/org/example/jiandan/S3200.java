package org.example.jiandan;

public class S3200 {
    public int maxHeightOfTriangle(int red, int blue) {
        return Math.max(maxHeight(red, blue), maxHeight(blue, red));
    }

    private int maxHeight(int a, int b) {
        int n = 0, sum;
        do {
            n++;
            sum = getSum(1, n);
        } while (sum <= a);
        n = n - 1;
        if (getSum(2, n) <= b) {
            return 2 * n;
        } else if (getSum(2, n - 1) <= b) {
            return 2 * n - 1;
        } else {
            for (int i = n - 2; i > 0; i--) {
                if (getSum(2, i) <= b) {
                    return 2 * i + 1;
                }
            }
        }
        return 0;
    }

    private int getSum(int a1, int n) {
        return n * a1 + n * (n - 1);
    }
}