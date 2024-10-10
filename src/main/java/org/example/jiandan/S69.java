package org.example.jiandan;

public class S69 {
    public int mySqrt(int x) {
        long f = x;
        do {
            f /= 2;
        } while (f * f > x);
        long i = f;
        while (i * i <= x) {
            i++;
        }
        return (int) (i - 1);
    }

    public int mySqrt2(int x) {
        long left = 1, right = x;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid > x) {
                right = mid - 1;
            } else if (mid * mid < x) {
                left = mid + 1;
            } else {
                return (int) mid;
            }
        }
        return (int) left - 1;
    }
}