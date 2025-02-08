package org.example.jiandan;

/**
 * 171. Excel 表列序号
 */
public class S171 {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result *= 26;
            result += columnTitle.charAt(i) - 'A' + 1;
        }
        return result;
    }
}
