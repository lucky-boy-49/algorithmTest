package org.example.jiandan;

/**
 * 2278. 字母在字符串中的百分比
 */
public class S2278 {
    public int percentageLetter(String s, char letter) {
        int size = 0, letSize = 0;
        for (char c : s.toCharArray()) {
            size++;
            if (c == letter) {
                letSize++;
            }
        }
        return (int) ((double) 100 * letSize / size);
    }
}
