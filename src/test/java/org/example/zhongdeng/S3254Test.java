package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S3254Test {

    @Test
    void resultsArray() {
        S3254 s3254 = new S3254();
        assertArrayEquals(new int[] {-1,3,-1,3,-1},
                s3254.resultsArray(new int[] {3,2,3,2,3,2}, 2));
        assertArrayEquals(new int[] {-1,3,-1,3,-1},
                s3254.resultsArray2(new int[] {3,2,3,2,3,2}, 2));
    }
}