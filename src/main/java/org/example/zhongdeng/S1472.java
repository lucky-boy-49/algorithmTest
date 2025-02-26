package org.example.zhongdeng;

/**
 * 1472. 设计浏览器历史记录
 */
public class S1472 {

    private Node cut;

    public S1472(String homepage) {
        cut = new Node(homepage);
    }

    public void visit(String url) {
        Node node = new Node(url);
        cut.next = node;
        node.pre = cut;
        cut = node;
    }

    public String back(int steps) {
        while (steps > 0 && cut.pre != null) {
            cut = cut.pre;
            steps--;
        }
        return cut.page;
    }

    public String forward(int steps) {
        while (steps > 0 && cut.next != null) {
            cut = cut.next;
            steps--;
        }
        return cut.page;
    }

    private static class Node {
        String page;
        Node next;
        Node pre;

        public Node(String page) {
            this.page = page;
        }
    }
}
