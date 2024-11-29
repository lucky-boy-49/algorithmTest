package org.example.kunnan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S3251Test {

    @Test
    void countOfPairs() {
        S3251 s3251 = new S3251();
        assertEquals(0, s3251.countOfPairs(new int[]{9, 18, 23, 5, 13, 9, 31, 41, 31, 31}));
    }

    @Test
    void countOfPairs2() {
        S3251 s3251 = new S3251();
        assertEquals(35, s3251.countOfPairs2(new int[]{41, 3, 41, 41}));
    }
}