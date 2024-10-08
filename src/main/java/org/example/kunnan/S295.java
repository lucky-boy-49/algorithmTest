package org.example.kunnan;

import java.util.PriorityQueue;
import java.util.Queue;

public class S295 {

    private final Queue<Integer> q1;
    private final Queue<Integer> q2;

    public S295() {
        q1 = new PriorityQueue<>((a, b) -> b - a);
        q2 = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (q1.isEmpty()) {
            q1.add(num);
        } else if (q1.size() == q2.size()) {
            if (num <= q2.peek()) {
                q1.add(num);
            } else {
                q2.add(num);
                q1.add(q2.poll());
            }
        } else {
            q1.add(num);
            q2.add(q1.poll());
        }
    }

    public double findMedian() {
        if (!q1.isEmpty() && q1.size() == q2.size()) {
            return (double) (q1.peek() + q2.peek()) / 2;
        } else if (!q1.isEmpty()){
            return q1.peek();
        }
        return 0;
    }

}