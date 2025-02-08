package org.example.jiandan;

/**
 * 168. Excel 表列名称
 */
public class S168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            int current = (columnNumber - 1) % 26;
            columnNumber = (columnNumber - 1) / 26;
            result.insert(0, (char) ('A' + current));
        }
        return result.toString();
    }
}
