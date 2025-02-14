package org.example.jiandan;

import java.util.List;

/**
 * 345. 反转字符串中的元音字母
 */
public class S345 {

    private static final List<Character> letters = List.of('a', 'e', 'i', 'o', 'u'
            , 'A', 'E', 'I', 'O', 'U');

    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int l = 0, r = chars.length - 1;
        while (l < r) {
            while (check(chars[l]) && l < chars.length - 1) {
                l++;
            }
            while (check(chars[r])) {
                r--;
            }
            if (l >= r) break;
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }
        return new String(chars);
    }

    private boolean check(char c) {
        for (Character letter : letters) {
            if (c == letter) {
                return false;
            }
        }
        return true;
    }
}
