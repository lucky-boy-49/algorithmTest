package org.example.jiandan;

/**
 * 2716. 最小化字符串长度
 */
public class S2716 {
    public int minimizedStringLength(String s) {
        int flag = 0;
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            flag |= 1 << (aChar - 'a');
        }
        return Integer.bitCount(flag);
    }
}
