package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S3180Test {

    @Test
    void maxTotalReward() {
        S3180 s3180 = new S3180();
        assertEquals(11, s3180.maxTotalReward(new int[] {1,6,4,3,2}));
        assertEquals(11, s3180.maxTotalReward2(new int[] {1,6,4,3,2}));
    }
}