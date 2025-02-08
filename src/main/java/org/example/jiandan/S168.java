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
            char character;

            character = (char) ('A' + current);
            result.insert(0, character);
        }
        return result.toString();
    }
}
