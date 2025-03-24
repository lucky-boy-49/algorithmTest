package org.example.jiandan;

/**
 * 2255. 统计是给定字符串前缀的字符串数目
 */
public class S2255 {
    public int countPrefixes(String[] words, String s) {
        int ans = 0;
        for (String word : words) {
            if (s.startsWith(word)) {
                ans++;
            }
        }
        return ans;
    }
}
