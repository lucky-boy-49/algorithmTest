package org.example.jiandan;

import java.util.ArrayList;
import java.util.List;

/**
 * 119. 杨辉三角 II
 */
public class S119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex / 2; i++) {
            list.add(choice(rowIndex, i));
        }
        for (int i = rowIndex / 2 + 1; i <= rowIndex; i++) {
            list.add(list.get(rowIndex - i));
        }
        return list;
    }

    private int choice(int n, int m) {
        long res = 1;
        for (int i = 1; i <= m; i++) {
            res = res * (n - m + i) / i;
        }
        return (int) res;
    }
}
