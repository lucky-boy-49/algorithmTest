package org.example.kunnan;

import java.util.HashMap;
import java.util.Map;

public class S887 {
    private final Map<Integer, Integer> memo = new HashMap<>();

    public int superEggDrop(int k, int n) {
        if (!memo.containsKey(n * 100 + k)) {
            int ans;
            if (n == 0) {
                ans = 0;
            } else if (k == 1) {
                ans = n;
            } else {
                int lo = 1, hi = n;
                while (lo + 1 < hi) {
                    int x = (lo + hi) / 2;
                    int t1 = superEggDrop(k - 1, x - 1);
                    int t2 = superEggDrop(k, n - x);

                    if (t1 < t2) {
                        lo = x;
                    } else if (t1 > t2) {
                        hi = x;
                    } else {
                        lo = hi = x;
                    }
                }

                ans = 1 + Math.min(Math.max(superEggDrop(k - 1, lo - 1), superEggDrop(k, n - lo)),
                        Math.max(superEggDrop(k - 1, hi - 1), superEggDrop(k, n - hi)));
            }

            memo.put(n * 100 + k, ans);
        }

        return memo.get(n * 100 + k);
    }
}
