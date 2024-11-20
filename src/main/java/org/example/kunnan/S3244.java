package org.example.kunnan;

public class S3244 {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        Node[] distances = new Node[n];
        distances[0] = new Node();
        for (int i = 1; i < n; i++) {
            distances[i] = new Node();
            distances[i - 1].next = distances[i];
        }
        int size = n;
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            if (!distances[left].flg &&  !distances[right].flg) {
                Node next = distances[left].next;
                while (next != distances[right]) {
                    next.flg = true;
                    next = next.next;
                    size--;
                }
                distances[left].next = distances[right];
            }
            result[i] = size - 1;
        }
        return result;
    }
    class Node {
        int v;
        boolean flg;
        Node next;
    }
}
