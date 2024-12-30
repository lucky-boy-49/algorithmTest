package org.example.zhongdeng;

import org.example.ListNode;
import org.example.TreeNode;

public class S1367 {
    private ListNode head;

    public boolean isSubPath(ListNode head, TreeNode root) {
        this.head = head;
        return dfs(head, root);
    }

    private boolean dfs(ListNode list, TreeNode tree) {
        if (list == null) {
            return true;
        }
        if (tree == null) {
            return false;
        }
        return list.val == tree.val && (dfs(list.next, tree.left) || dfs(list.next, tree.right)) ||
                list == head && (dfs(head, tree.left) || dfs(head, tree.right));
    }
}
