package org.example.jiandan;

import org.example.ListNode;

/**
 * 1290. 二进制链表转整数
 */
public class S1290 {
    public int getDecimalValue(ListNode head) {
        int l = 1, ans = head.val;
        ListNode node = head.next;
        while (node != null) {
            ans <<= l;
            ans |= node.val;
            node = node.next;
        }
        return ans;
    }

}
