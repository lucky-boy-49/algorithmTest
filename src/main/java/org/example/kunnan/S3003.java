package org.example.kunnan;

/**
 * 3003. 执行操作后的最大分割数量
 */
public class S3003 {
    private int seg = 1, mask = 0, size = 0;

    public int maxPartitionsAfterOperations(String S, int k) {
        if (k == 26) {
            return 1;
        }

        char[] s = S.toCharArray();
        int n = s.length;
        int[] sufSeg = new int[n + 1];
        int[] sufMask = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            update(s[i], k);
            sufSeg[i] = seg;
            sufMask[i] = mask;
        }

        int ans = seg; // 不修改任何字母
        seg = 1; mask = 0; size = 0;
        for (int i = 0; i < n; i++) {
            int res = seg + sufSeg[i + 1]; // 情况 3
            int unionSize = Integer.bitCount(mask | sufMask[i + 1]);
            if (unionSize < k) {
                res--; // 情况 1
            } else if (unionSize < 26 && size == k && Integer.bitCount(sufMask[i + 1]) == k) {
                res++; // 情况 2
            }
            ans = Math.max(ans, res);
            update(s[i], k);
        }
        return ans;
    }

    private void update(char c, int k) {
        int bit = 1 << (c - 'a');
        if ((mask & bit) != 0) {
            return;
        }
        if (++size > k) {
            seg++; // c 在新的一段中
            mask = bit;
            size = 1;
        } else {
            mask |= bit;
        }
    }
}
