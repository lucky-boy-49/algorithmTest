package org.example.zhongdeng;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 855. 考场就座
 */
public class S855 {

    private final int size;
    private final Queue<int[]> q;
    private final Map<Integer, Node> map;

    public S855(int n) {
        size = n;
        q = new PriorityQueue<>((a, b) -> {
            int size1 = (a[0] == -1 || a[1] == size ? a[1] - 1 : (a[0] + a[1]) / 2) - a[0];
            int size2 = (b[0] == -1 || b[1] == size ? b[1] - 1 : (b[0] + b[1]) / 2) - b[0];
            if (size1 == size2) {
                return a[0] - b[0];
            }
            return size2 - size1;
        });
        map = new HashMap<>();
    }

    public int seat() {
        if (q.isEmpty()) {
            seat2(-1, 0, size);
            return 0;
        } else {
            int[] poll = q.poll();
            if (poll[0] == -1) {
                seat2(-1, 0, poll[1]);
                return 0;
            } else if (poll[1] == size) {
                seat2(poll[0], size - 1, size);
                return size - 1;
            } else {
                int mid = (poll[0] + poll[1]) / 2;
                seat2(poll[0], mid, poll[1]);
                return mid;
            }
        }
    }

    public void leave(int p) {
        Node node = map.get(p);
        if (node != null) {
            int[] arr = new int[]{node.next[0], node.pre[1]};
            q.remove(node.pre);
            q.remove(node.next);
            q.offer(arr);
            map.computeIfAbsent(node.next[0], k -> new Node()).pre = arr;
            map.computeIfAbsent(node.pre[1], k -> new Node()).next = arr;
        }
        map.put(p, new Node());
    }

    private void offerQueue(int[]... arr) {
        for (int[] o : arr) {
            q.offer(o);
        }
    }

    private void putMap(int[]... arrs) {
        for (int[] arr : arrs) {
            map.computeIfAbsent(arr[0], k -> new Node()).pre = arr;
            map.computeIfAbsent(arr[1], k -> new Node()).next = arr;
        }
    }

    private void seat2(int l, int m, int r) {
        int[] arr1 = new int[]{l, m};
        int[] arr2 = new int[]{m, r};
        offerQueue(arr1, arr2);
        putMap(arr1, arr2);
    }

}

class Node {
    int[] pre;
    int[] next;
}
