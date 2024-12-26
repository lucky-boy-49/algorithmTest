package org.example.jiandan;

/**
 * 3083. 字符串及其反转中是否存在同一子字符串
 */
public class S3083 {
    public boolean isSubstringPresent(String s) {
        int[] vis = new int[26];
        for (int i = 1; i < s.length(); i++) {
            int x = s.charAt(i - 1) - 'a';
            int y = s.charAt(i) - 'a';
            vis[x] |= 1 << y;
            if ((vis[y] >> x & 1) > 0) {
                return true;
            }
        }
        return false;
    }
}
