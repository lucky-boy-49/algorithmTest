package org.example.jiandan;

import org.example.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 257. 二叉树的所有路径
 */
public class S257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        dfs(result, root, new StringBuilder(String.valueOf(root.val)));
        return result;
    }

    private void dfs(List<String> result, TreeNode root, StringBuilder s) {
        if (root.left == null && root.right == null) {
            result.add(s.toString());
        }
        if (root.left != null) {
            dfs(result, root.left, new StringBuilder(s).append("->").append(root.left.val));
        }
        if (root.right != null) {
            dfs(result, root.right, new StringBuilder(s).append("->").append(root.right.val));
        }
    }
}
