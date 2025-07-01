package org.example.jiandan;

/**
 * 3330. 找到初始输入字符串 I
 */
public class S3330 {
    public int possibleStringCount(String word) {
        int ans = 1;
        char[] chars = word.toCharArray();
        char c = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (c == chars[i]) {
                ans++;
            }
            c = chars[i];
        }
        return ans;
    }
}
