package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S3185Test {

    @Test
    void countCompleteDayPairs() {
        S3185 s3185 = new S3185();
        assertEquals(2, s3185.countCompleteDayPairs(new int[] {12,12,30,24,24}));
    }
}