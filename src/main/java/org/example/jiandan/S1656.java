package org.example.jiandan;

import java.util.ArrayList;
import java.util.List;

/**
 * 1656. 设计有序流
 */
public class S1656 {
    private final String[] arr;
    private int pre;

    public S1656(int n) {
        arr = new String[n + 1];
        pre = 1;
    }

    public List<String> insert(int idKey, String value) {
        arr[idKey] = value;
        List<String> res = new ArrayList<>();
        while (pre < arr.length && arr[pre] != null) {
            res.add(arr[pre++]);
        }
        return res;
    }
}
