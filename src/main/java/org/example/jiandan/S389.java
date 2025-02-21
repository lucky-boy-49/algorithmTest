package org.example.jiandan;

/**
 * 389. 找不同
 */
public class S389 {
    public char findTheDifference(String s, String t) {
        int size1 = 0;
        for (char c : s.toCharArray()) {
            size1 += c;
        }
        int size2 = 0;
        for (char c : t.toCharArray()) {
            size2 += c;
        }
        return (char) (size2 - size1);
    }
}
