package org.example.zhongdeng;

/**
 * 3291. 形成目标字符串需要的最少字符串数 I
 */
public class S3291 {
    public int minValidStrings(String[] words, String target) {

        int n = words.length;
        int[][] nexts = new int[n][];

        for (int i = 0; i < n; ++i)
            nexts[i] = getNext(words[i] + '#' + target);

        int ans = 0;
        int len = target.length();
        while (len > 0) {
            int maxMatchSuffix = 0;
            for (int i = 0; i < n; ++i)
                maxMatchSuffix = Math.max(maxMatchSuffix, nexts[i][words[i].length() + len]);

            if (maxMatchSuffix == 0)
                return -1;
            ++ans;
            len -= maxMatchSuffix;
        }

        return ans;
    }

    private int[] getNext(String pattern) {

        char[] cs = pattern.toCharArray();
        int n = cs.length;

        int[] next = new int[n];
        for (int i = 1, j = 0; i < n; ++i) {
            while (j > 0 && cs[j] != cs[i])
                j = next[j - 1];
            if (cs[j] == cs[i])
                next[i] = ++j;
        }

        return next;
    }
}
