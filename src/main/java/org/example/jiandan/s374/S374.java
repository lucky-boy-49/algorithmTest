package org.example.jiandan.s374;

/**
 * 374. 猜数字大小
 */
public class S374 extends GuessGame {
    public int guessNumber(int n) {
        int l = 1, r = n;
        int mid = l + (r - l) / 2;
        int flag;
        while ((flag = guess(mid)) != 0) {
            if (flag == -1) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
            mid = l + (r - l) / 2;
        }
        return mid;
    }
}
