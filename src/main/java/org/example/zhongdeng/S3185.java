package org.example.zhongdeng;

public class S3185 {
    public long countCompleteDayPairs(int[] hours) {
        long res = 0L;
        int[] cnt = new int[24];
        int zeroCnt = 0;
        for(int hour : hours){
            int m = hour % 24;
            if(m == 0){
                res += zeroCnt;
                zeroCnt++;
            } else {
                res += cnt[24 - m];
                cnt[m]++;
            }
        }
        return res;
    }
}
