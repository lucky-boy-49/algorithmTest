package org.example.zhongdeng;

/**
 * 3494. 酿造药水需要的最少总时间
 */
public class S3494 {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length;
        long[] lastFinish = new long[n]; // 第 i 名巫师完成上一瓶药水的时间
        for (int m : mana) {
            // 按题意模拟
            long sumT = 0;
            for (int i = 0; i < n; i++) {
                sumT = Math.max(sumT, lastFinish[i]) + (long) skill[i] * m;
            }
            // 倒推：如果酿造药水的过程中没有停顿，那么 lastFinish[i] 应该是多少
            lastFinish[n - 1] = sumT;
            for (int i = n - 2; i >= 0; i--) {
                lastFinish[i] = lastFinish[i + 1] - (long) skill[i + 1] * m;
            }
        }
        return lastFinish[n - 1];

    }
}
