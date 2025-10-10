package org.example.zhongdeng;

/**
 * 3147. 从魔法师身上吸取的最大能量
 */
public class S3147 {
    public int maximumEnergy(int[] energy, int k) {
        var ans = Integer.MIN_VALUE;
        for (int i = 0; i < energy.length; i++) {
            if (i - k >= 0) {
                energy[i] = Math.max(energy[i] + energy[i - k], energy[i]);
            }
        }
        for (int i = 1; i <= k; i++) {
            ans = Math.max(ans, energy[energy.length - i]);
        }
        return ans;
    }
}
