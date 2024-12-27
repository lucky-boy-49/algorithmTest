package org.example.zhongdeng;

import java.util.Arrays;

/**
 * 3138. 同位字符串连接的最小长度
 */
public class S3138 {
    public int minAnagramLength(String s) {
        int n = s.length();
        for (int i = 1; i < n; i++) {
            if (n % i != 0) {
                continue;
            }
            if (check(s, i)) {
                return i;
            }
        }
        return n;
    }

    private boolean check(String s, int m) {
        int[] count0 = new int[26];
        for (int j = 0; j < s.length(); j += m) {
            int[] count1 = new int[26];
            for (int k = j; k < j + m; k++) {
                count1[s.charAt(k) - 'a']++;
            }
            if (j > 0 && !Arrays.equals(count0, count1)) {
                return false;
            }
            count0 = count1;
        }
        return true;
    }
}
