package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S3191Test {

    @Test
    void minOperations() {
        S3191 s3191 = new S3191();
        assertEquals(-1, s3191.minOperations(new int[] {1,0,0,1,1,0,1,1,1}));
    }
}