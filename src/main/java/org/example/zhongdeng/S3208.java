package org.example.zhongdeng;

/**
 * 3208. 交替组 II
 */
public class S3208 {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int start = 0, ans = 0;
        if (start == colors.length) return ans;
        int i = 1, right = 1;
        while (++i <= k && colors[right] != colors[(right - 1 + colors.length) % colors.length])
            right = (right + 1) % colors.length;
        do {
            if (i > k) {
                ans++;
                start++;
                i = k - 1;
            } else {
                start = right < start ? colors.length : right;
                i = 1;
                right = (right + 1) % colors.length;
            }
            while (start < colors.length && ++i <= k && colors[right] != colors[(right - 1 + colors.length) % colors.length])
                right = (right + 1) % colors.length;
        } while (start < colors.length);
        return ans;
    }

    public int numberOfAlternatingGroups2(int[] colors, int k) {
        int left = 0, right = 1;
        int ans = 0;
        int n = colors.length;
        int len = 1;
        boolean check = false;
        // 先处理第一遍
        while (right < n) {
            if (colors[right] == colors[right - 1]) {
                left = right;
                check = true;
            }
            if (!check) {
                len = right + 1 - left;
            }
            if (right - left + 1 >= k) {
                ans++;
            }
            right++;
        }
        if (colors[n - 1] != colors[0]) {
            if (right % n == left)
                return n;
            if (right - left >= k) {
                left = right - k + 1;
            }
            if (len >= k) {
                ans += right - left;
            } else {
                int v = right - left - (k - len);
                if (v >= 0) {
                    ans += v + 1;
                }
            }
        }
        return ans;
    }
}
