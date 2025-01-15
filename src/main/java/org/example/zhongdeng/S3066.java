package org.example.zhongdeng;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 3066. 超过阈值的最少操作数 II
 */
public class S3066 {
    public int minOperations(int[] nums, int k) {
        Queue<Long> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.offer((long) num);
        }
        int ans = 0;
        while (queue.size() >= 2 && queue.peek() < k) {
            Long poll1 = queue.poll();
            Long poll2 = queue.poll();
            queue.offer(Math.min(poll1, poll2) * 2 + Math.max(poll1, poll2));
            ans++;
        }
        return ans;
    }
}
