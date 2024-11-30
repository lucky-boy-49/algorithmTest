package org.example.jiandan;

/**
 * 3232. 判断是否可以赢得数字游戏
 */
public class S3232 {
    public boolean canAliceWin(int[] nums) {
        int sumSingleDigit = 0, sumDoubleDigit = 0, singleDigitOther = 0, doubleDigitOther = 0;
        for (int num : nums) {
            if (num < 10) {
                sumSingleDigit += num;
            } else {
                singleDigitOther += num;
            }
            if (num >= 10) {
                sumDoubleDigit += num;
            } else {
                doubleDigitOther += num;
            }
        }
        return sumSingleDigit > singleDigitOther || sumDoubleDigit > doubleDigitOther;
    }
}
