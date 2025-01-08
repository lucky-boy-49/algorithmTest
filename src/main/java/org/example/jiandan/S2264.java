package org.example.jiandan;

/**
 * 2264. 字符串中最大的 3 位相同数字
 */
public class S2264 {
    public String largestGoodInteger(String num) {
        for (char d = '9'; d >= '0'; d--) {
            String s = String.valueOf(d).repeat(3);
            if (num.contains(s)) {
                return s;
            }
        }
        return "";
    }
}
