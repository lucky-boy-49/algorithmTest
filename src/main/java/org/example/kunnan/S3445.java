package org.example.kunnan;

public class S3445 {
    public int maxDifference(String s, int k) {
        final int INF = Integer.MAX_VALUE / 2;
        char[] sCharArray = s.toCharArray();
        int ans = -INF;
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                if (y == x) {
                    continue;
                }
                int[] curS = new int[5];
                int[] preS = new int[5];
                int[][] minS = {{INF, INF}, {INF, INF}};
                int left = 0;
                for (int i = 0; i < sCharArray.length; i++) {
                    curS[sCharArray[i] - '0']++;
                    int r = i + 1;
                    while (r - left >= k && curS[x] > preS[x] && curS[y] > preS[y]) {
                        int p = preS[x] & 1;
                        int q = preS[y] & 1;
                        minS[p][q] = Math.min(minS[p][q], preS[x] - preS[y]);
                        preS[sCharArray[left] - '0']++;
                        left++;
                    }
                    ans = Math.max(ans, curS[x] - curS[y] - minS[curS[x] & 1 ^ 1][curS[y] & 1]);
                }
            }
        }
        return ans;
    }
}
