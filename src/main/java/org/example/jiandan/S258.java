package org.example.jiandan;

/**
 * 258. 各位相加
 */
public class S258 {
    public int addDigits(int num) {
        while (num >= 10) {
            int tmp = 0;
            while (num > 0) {
                tmp += num % 10;
                num = num / 10;
            }
            num = tmp;
        }
        return num;
    }
}
