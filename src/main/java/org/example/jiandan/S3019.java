package org.example.jiandan;

/**
 * 3019. 按键变更的次数
 */
public class S3019 {
    public int countKeyChanges(String s) {
        char[] chars = s.toCharArray();
        int count = 0, index = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[index] && Math.abs(chars[i] - chars[index]) != 32) {
                count++;
                index = i;
            }
        }
        return count;
    }
}
