package org.example.jiandan;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 225. 用队列实现栈
 */
public class S225 {

    private final Queue<Integer> queue1;
    private final Queue<Integer> queue2;

    public S225() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue1.add(x);
    }

    public int pop() {
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        int x = queue1.isEmpty() ? -1 : queue1.poll();
        while (!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }
        return x;
    }

    public int top() {
        int x = pop();
        if (x != -1) {
            queue1.add(x);
        }
        return x;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
