package org.example.jiandan;

import org.example.TreeNode;

/**
 * 404. 左叶子之和
 */
public class S404 {
    public int sumOfLeftLeaves(TreeNode root) {
        return getRes(root, 1);
    }

    private int getRes(TreeNode root, int i) {
        if (root.left == null && root.right == null && i == 2) {
            return root.val;
        } else {
            int left = 0;
            int right = 0;
            if (root.left != null) {
                left = getRes(root.left, 2);
            }
            if (root.right != null) {
                right = getRes(root.right, 3);
            }
            return left + right;
        }
    }
}
