package org.example.zhongdeng;

/**
 * 2829. k-avoiding 数组的最小总和
 */
public class S2829 {
    public int minimumSum(int n, int k) {
        int ans = 0, num = 1;
        long flag = 0;
        while (n > 0) {
            if (num > k) {
                ans += num;
                n--;
            } else {
                if (((flag >> num) & 1) == 0) {
                    ans += num;
                    n--;
                    flag |= 1L << (k - num);
                }
            }
            num++;
        }
        return ans;
    }
}
