package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S3192Test {

    @Test
    void minOperations() {
        S3192 s3192 = new S3192();
        assertEquals(4, s3192.minOperations(new int[] {0,1,1,0,1}));
        assertEquals(1, s3192.minOperations(new int[] {1,0,0,0 }));
    }
}