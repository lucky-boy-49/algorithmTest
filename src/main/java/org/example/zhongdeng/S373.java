package org.example.zhongdeng;

import java.util.*;

public class S373 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> (nums1[a[0]] + nums2[a[1]])));
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            pq.add(new int[]{i, 0});
        }
        while (k > 0 && !pq.isEmpty()) {
            int[] idx = pq.poll();
            ans.add(List.of(nums1[idx[0]], nums2[idx[1]]));
            if (idx[1] + 1 < nums2.length) {
                pq.add(new int[]{idx[0], idx[1] + 1});
            }
            k--;
        }
        return ans;
    }
}