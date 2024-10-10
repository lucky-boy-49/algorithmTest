package org.example.zhongdeng;

public class S50 {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n == -1) {
            return 1 / x;
        }
        int newN = n / 2;
        if (n % 2 == 0) {
            double v = myPow(x, newN);
            return v * v;
        } else {
            return myPow(x, newN) * myPow(x, newN < 0 ? newN - 1 : newN + 1);
        }
    }
}
