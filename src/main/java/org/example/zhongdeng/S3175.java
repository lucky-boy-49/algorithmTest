package org.example.zhongdeng;

public class S3175 {
    public int findWinningPlayer(int[] skills, int k) {
        int i = 0, sum = 0, max = skills[0], maxIndex = 0;
        for (int j = 1; j < skills.length; j++) {
            if (skills[i] > skills[j]) {
                sum++;
            } else {
                sum = 1;
                i = j;
            }
            if (sum == k) {
                return i;
            }
            if (max < skills[j]) {
                max = skills[j];
                maxIndex = j;
            }
        }
        return maxIndex;
    }
}
