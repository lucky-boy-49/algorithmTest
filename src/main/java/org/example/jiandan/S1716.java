package org.example.jiandan;

/**
 * 1716. 计算力扣银行的钱
 */
public class S1716 {
    public int totalMoney(int n) {
        if (n <= 7) {
            var ans = 0;
            for (int i = 1; i <= n; i++) {
                ans += i;
            }
            return ans;
        }
        var y = n / 7;
        var x = n % 7;
        var z = 1 + y;
        var ans = 0;
        for (int i = 0; i < y; i++) {
            ans += 28 + i * 7;
        }
        for (int i = 1; i <= x; i++) {
            ans += z++;
        }
        return ans;
    }
}
