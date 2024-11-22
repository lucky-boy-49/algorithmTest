package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S3233Test {

    @Test
    void nonSpecialCount() {
        S3233 s3233 = new S3233();
        assertEquals(3, s3233.nonSpecialCount(5, 7));
        assertEquals(11, s3233.nonSpecialCount(4, 16));
    }
}