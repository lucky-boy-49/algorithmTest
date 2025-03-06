package org.example.jiandan;

/**
 * 409. 最长回文串
 */
public class S409 {
    public int longestPalindrome(String s) {
        int res = 0;
        long flag = 0;
        for (char c : s.toCharArray()) {
            if (((flag >> (int) c) & 1) == 1) {
                res += 2;
                flag = flag & ~(1L << (int) c);
            } else {
                flag |= (1L << (int) c);
            }
        }
        return res + (res == s.length() ? 0 : 1);
    }
}
