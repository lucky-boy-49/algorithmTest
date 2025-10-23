package org.example.jiandan;

import java.util.ArrayList;
import java.util.Objects;

/**
 * 3461. 判断操作后字符串中的数字是否相等 I
 */
public class S3461 {
    public boolean hasSameDigits(String s) {
        var list = new ArrayList<Integer>();
        for (char c : s.toCharArray()) {
            list.add(c - '0');
        }
        while (list.size() > 2) {
            var newList = new ArrayList<Integer>();
            for (int i = 1; i < list.size(); i++) {
                newList.add((list.get(i - 1) + list.get(i)) % 10);
            }
            list = newList;
        }
        return list.size() == 2 && Objects.equals(list.getFirst(), list.getLast());
    }
}
