package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S3233_2Test {

    @Test
    void nonSpecialCount() {
        S3233_2 s3233 = new S3233_2();
        assertEquals(3, s3233.nonSpecialCount(5, 7));
        assertEquals(11, s3233.nonSpecialCount(4, 16));
    }
}