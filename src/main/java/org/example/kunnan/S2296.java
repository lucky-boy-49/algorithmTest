package org.example.kunnan;

/**
 * 2296. 设计一个文本编辑器
 */
public class S2296 {
    private final CharNode head;
    private final CharNode tail;
    private CharNode index;

    public S2296() {
        head = new CharNode('1', null, null);
        tail = new CharNode('1', head, null);
        head.next = tail;
        index = head;
    }

    public void addText(String text) {
        CharNode tailNext = index.next;
        for (char c : text.toCharArray()) {
            CharNode node = new CharNode(c, index, null);
            index.next = node;
            index = node;
        }
        index.next = tailNext;
        tailNext.pre = index;
    }

    public int deleteText(int k) {
        int res;
        for (res = 1; res <= k && index != head; res++) {
            CharNode nextNode = index.next;
            nextNode.pre = index.pre;
            index.pre.next = nextNode;
            index = nextNode.pre;
        }
        return res - 1;
    }

    public String cursorLeft(int k) {
        StringBuilder res = new StringBuilder();
        int i;
        for (i = 0; i < k && index != head; i++) {
            index = index.pre;
        }
        CharNode node = index;
        for (int j = 0; j < 10 && node != head; j++) {
            res.insert(0, node.code);
            node = node.pre;
        }
        return res.toString();
    }

    public String cursorRight(int k) {
        StringBuilder res = new StringBuilder();
        int i;
        for (i = 0; i < k && index != tail; i++) {
            index = index.next;
        }
        CharNode node = index;
        if (index == tail) {
            node = index.pre;
            index = index.pre;
        }
        for (int j = 0; j < 10 && node != head; j++) {
            res.insert(0, node.code);
            node = node.pre;
        }
        return res.toString();
    }

    private static class CharNode {
        char code;
        CharNode pre;
        CharNode next;

        public CharNode(char code, CharNode pre, CharNode next) {
            this.code = code;
            this.pre = pre;
            this.next = next;
        }
    }
}
