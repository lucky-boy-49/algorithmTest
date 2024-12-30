package org.example.zhongdeng;

import org.example.TreeNode;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNodeConverter implements ArgumentConverter {
    @Override
    public Object convert(Object source, ParameterContext context) throws ArgumentConversionException {
        String data = (String) source;
        String[] rows = data.substring(1, data.length() - 1).split(",");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(rows[0]));
        queue.offer(root);
        int i = 1;
        while (!queue.isEmpty() && i < rows.length) {
            TreeNode poll = queue.poll();
            if (!rows[i].equals("null")) {
                TreeNode left = new TreeNode(Integer.parseInt(rows[i++]));
                poll.left = left;
                queue.offer(left);
            } else {
                i++;
            }
            if (i < rows.length && !rows[i].equals("null")) {
                TreeNode right = new TreeNode(Integer.parseInt(rows[i++]));
                poll.right = right;
                queue.offer(right);
            } else {
                i++;
            }
        }
        return root;
    }
}
