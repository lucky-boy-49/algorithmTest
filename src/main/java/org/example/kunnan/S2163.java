package org.example.kunnan;

import java.util.PriorityQueue;

/**
 * 2163. 删除元素后和的最小差值
 */
public class S2163 {
    public long minimumDifference(int[] nums) {
        int m = nums.length;
        int n = m / 3;
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        long sum = 0;
        for (int i = m - 1; i >= m - n; i--) {
            minPQ.offer(nums[i]);
            sum += nums[i];
        }

        long[] sufMax = new long[m - n + 1]; // 后缀最大和
        sufMax[m - n] = sum;
        for (int i = m - n - 1; i >= n; i--) {
            int v = nums[i];
            if (v > minPQ.peek()) {
                sum += v - minPQ.poll();
                minPQ.offer(v);
            }
            sufMax[i] = sum;
        }

        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((a, b) -> b - a);
        long preMin = 0; // 前缀最小和
        for (int i = 0; i < n; ++i) {
            maxPQ.offer(nums[i]);
            preMin += nums[i];
        }

        long ans = preMin - sufMax[n]; // i=n-1 时的答案
        for (int i = n; i < m - n; i++) {
            int v = nums[i];
            if (v < maxPQ.peek()) {
                preMin += v - maxPQ.poll();
                maxPQ.offer(v);
            }
            ans = Math.min(ans, preMin - sufMax[i + 1]);
        }
        return ans;
    }
}
