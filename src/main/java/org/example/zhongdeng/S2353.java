package org.example.zhongdeng;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 2353. 设计食物评分系统
 */
public class S2353 {
    private final Map<String, Queue<Node>> map1;
    private final Map<String, Node> map2;

    public S2353(String[] foods, String[] cuisines, int[] ratings) {
        map1 = new HashMap<>(cuisines.length);
        map2 = new HashMap<>(cuisines.length);
        for (int i = 0; i < foods.length; i++) {
            Node node = new Node(foods[i], cuisines[i], ratings[i]);
            Queue<Node> q = new PriorityQueue<>();
            q.offer(node);
            map1.merge(cuisines[i], q, (o, n) -> {
                o.add(node);
                return o;
            });
            map2.put(foods[i], node);
        }
    }

    public void changeRating(String food, int newRating) {
        Node node = map2.get(food);
        Queue<Node> queue = map1.get(node.cuisines);
        queue.remove(node);
        Node newNode = new Node(node.food, node.cuisines, newRating);
        queue.offer(newNode);
        map2.put(food, newNode);
    }

    public String highestRated(String cuisine) {
        Queue<Node> queue = map1.get(cuisine);
        if (queue.isEmpty()) {
            return "";
        }
        return queue.peek().food;
    }

    private static class Node implements Comparable<Node> {
        String food;
        String cuisines;
        int ratings;

        public Node(String food, String cuisines, int ratings) {
            this.food = food;
            this.cuisines = cuisines;
            this.ratings = ratings;
        }

        @Override
        public int compareTo(Node node) {
            if (ratings == node.ratings) {
                return food.compareTo(node.food);
            }
            return node.ratings - ratings;
        }
    }
}
