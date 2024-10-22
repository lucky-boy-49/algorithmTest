package org.example.jiandan;

public class S3184 {
    public int countCompleteDayPairs(int[] hours) {
        int oneDay = 24, res = 0;
        int[] dp = new int[oneDay + 1];
        for (int i = hours.length - 1; i >= 0; i--) {
            int hour = hours[i] % oneDay;
            int difference = (oneDay - hour) % oneDay;
            if (dp[difference] > 0) {
                res += dp[difference];
            }
            dp[hour]++;
        }
        return res;
    }
}
