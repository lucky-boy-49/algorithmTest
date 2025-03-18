package org.example.jiandan;

/**
 * 2614. 对角线上的质数
 */
public class S2614 {

    public int diagonalPrime(int[][] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i][i])) {
                ans = Math.max(ans, nums[i][i]);
            }
            if (isPrime(nums[i][nums.length - i - 1])) {
                ans = Math.max(ans, nums[i][nums.length - i - 1]);
            }
        }
        return ans;
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        int i = 5, w = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i += w;
            w = 6 - w;
        }
        return true;
    }
}
