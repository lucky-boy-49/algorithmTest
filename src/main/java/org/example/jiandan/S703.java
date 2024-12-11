package org.example.jiandan;

/**
 * 703. 数据流中的第 K 大元素
 */
public class S703 {
    private final Node head = new Node(-1);
    private final int k;
    private Node tail = head;
    private int cur = 0;

    public S703(int k, int[] nums) {
        this.k = k;
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (cur == 0) {
            head.next = new Node(val);
            tail = head.next;
            cur++;
        } else {
            Node node = new Node(val);
            if (head.next.val >= val) {
                node.next = head.next;
                head.next = node;
                cur++;
            } else if (tail.val <= val) {
                tail.next = node;
                tail = node;
                cur++;
            } else {
                Node next = head.next;
                while (true) {
                    if (next.next.val > val) {
                        node.next = next.next;
                        next.next = node;
                        cur++;
                        break;
                    } else {
                        next = next.next;
                    }
                }
            }
        }
        if (cur > k) {
            cur--;
            head.next = head.next.next;
        }
        return cur == k ? head.next.val : -1;
    }

    static class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
        }
    }

}
