package org.example.zhongdeng;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 3484. 设计电子表格
 */
public class S3484 {

    private final int[][] table;
    private final static int COLUMN = 26;

    public S3484(int rows) {
        table = new int[COLUMN][rows + 1];
    }

    public void setCell(String cell, int value) {
        Matcher matcher = Pattern.compile("(\\D+)(\\d+)").matcher(cell);
        if (matcher.matches()) {
            int col = matcher.group(1).compareTo("A");
            int row = Integer.parseInt(matcher.group(2));
            table[col][row] = value;
        }
    }

    public void resetCell(String cell) {
        setCell(cell, 0);
    }

    public int getValue(String formula) {
        Pattern pattern = Pattern.compile("^=([A-Z]+\\d+|\\d+)\\+([A-Z]+\\d+|\\d+)$");
        Matcher matcher = pattern.matcher(formula);
        matcher.matches();
        String x = matcher.group(1);
        String y = matcher.group(2);
        return getAndNum(x) + getAndNum(y);
    }

    private int getAndNum(String numStr) {
        Matcher matcher = Pattern.compile("(\\D+)(\\d+)").matcher(numStr);
        if (matcher.matches()) {
            int col = matcher.group(1).compareTo("A");
            int row = Integer.parseInt(matcher.group(2));
            return table[col][row];
        } else {
           return Integer.parseInt(numStr);
        }
    }
}
