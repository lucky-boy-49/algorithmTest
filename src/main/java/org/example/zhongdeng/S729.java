package org.example.zhongdeng;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 729. 我的日程安排表 I
 */
public class S729 {
    private final TreeSet<int[]> tree;

    public S729() {
        tree = new TreeSet<>(Comparator.comparingInt(a -> a[0]));
    }

    public boolean book(int startTime, int endTime) {
        int[] node = {startTime, endTime};
        int[] r = tree.ceiling(node);
        int[] l = tree.floor(node);
        if (l != null && startTime < l[1]) return false;
        if (r != null && endTime > r[0]) return false;
        tree.add(node);
        return true;
    }
}
