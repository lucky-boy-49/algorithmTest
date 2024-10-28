package org.example.jiandan;

public class SLCP55 {
    public int getMinimumTime(int[] time, int[][] fruits, int limit) {
        int sumTime = 0;
        for (int[] fruit : fruits) {
            if (fruit[1] > limit) {
                double ceil = Math.ceil((double) fruit[1] / limit);
                sumTime += (int) (time[fruit[0]] * ceil);
            } else {
                sumTime += time[fruit[0]];
            }
        }
        return sumTime;
    }
}
