package org.example.zhongdeng;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/**
 * 3408. 设计任务管理器
 */
public class S3408 {

    TreeSet<Node> nodes = new TreeSet<>((n1, n2) -> {
        if (n1.priority == n2.priority) {
            return n2.taskId - n1.taskId;
        }
        return n2.priority - n1.priority;
    });
    Map<Integer, Node> map = new HashMap<>(16);

    public S3408(List<List<Integer>> tasks) {
        if (tasks != null) {
            for (List<Integer> task : tasks) {
                Node node = new Node(task.getFirst(), task.get(1), task.get(2));
                nodes.add(node);
                map.put(task.get(1), node);
            }
        }

    }

    public void add(int userId, int taskId, int priority) {
        Node node = new Node(userId, taskId, priority);
        nodes.add(node);
        map.put(taskId, node);
    }

    public void edit(int taskId, int newPriority) {
        Node node = map.get(taskId);
        if (node != null) {
            nodes.remove(node);
            node.priority = newPriority;
            nodes.add(node);
        }
    }

    public void rmv(int taskId) {
        Node node = map.get(taskId);
        if (node != null) {
            nodes.remove(node);
            map.remove(taskId);
        }
    }

    public int execTop() {
        if (!nodes.isEmpty()) {
            Node first = nodes.pollFirst();
            map.remove(first.taskId);
            return first.userId;
        } else {
            return -1;
        }
    }

    class Node {
        int userId;
        int taskId;
        int priority;

        public Node(int userId, int taskId, int priority) {
            this.userId = userId;
            this.taskId = taskId;
            this.priority = priority;
        }
    }

}
