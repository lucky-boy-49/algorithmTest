package org.example.kunnan;

/**
 * 1964. 找出到每个位置为止最长的有效障碍赛跑路线
 */
public class S1964 {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int n = obstacles.length;
        int[] arr = new int[n];
        int[] res = new int[n];
        int len = 0, idx = 0;

        for (var x : obstacles) {
            int ins = upperBound(arr, len, x);
            arr[ins] = x;
            res[idx] = ins + 1;
            if (ins == len) {
                len++;
            }
            idx++;
        }
        return res;
    }

    private int upperBound(int[] arr, int right, int t) {
        int left = 0;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (arr[mid] > t) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
