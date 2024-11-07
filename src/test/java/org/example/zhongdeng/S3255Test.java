package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S3255Test {

    @Test
    void resultsArray() {
        S3255 s3255 = new S3255();
        assertArrayEquals(new int[] {-1,3,-1,3,-1},
                s3255.resultsArray(new int[] {3,2,3,2,3,2}, 2));
    }
}