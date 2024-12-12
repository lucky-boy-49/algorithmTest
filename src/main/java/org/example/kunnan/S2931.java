package org.example.kunnan;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 2931. 购买物品的最大开销
 */
public class S2931 {
    public long maxSpending(int[][] values) {
        Queue<List<Integer>> q = new PriorityQueue<>(
                Comparator.comparingInt(item -> item.get(0)));
        for (int[] value : values) {
            List<Integer> list = new LinkedList<>();
            for (int length = value.length; length > 0; length--) {
                list.add(value[length - 1]);
            }
            q.offer(list);
        }
        long res = 0, day = 1;
        while (!q.isEmpty()) {
            List<Integer> list = q.poll();
            res += list.get(0) * day++;
            list.remove(0);
            if (!list.isEmpty()) {
                q.offer(list);
            }
        }
        return res;
    }

    public long maxSpending2(int[][] values) {
        int m = values.length;
        int n = values[0].length;
        int[] array = new int[m * n];
        for (int i = 0; i < m; i++) {
            System.arraycopy(values[i], 0, array, i * n, n);
        }
        Arrays.sort(array);
        // System.out.println(Arrays.toString(array));
        long result = 0L;
        for (int i = 0; i < array.length; i++) {
            result += (long) array[i] * (i + 1);
        }
        return result;
    }
}
