package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S3208Test {

    @Test
    void numberOfAlternatingGroups() {
        S3208 s3208 = new S3208();
        assertEquals(2, s3208.numberOfAlternatingGroups(new int[]{0, 1, 0, 0, 1, 0, 1}, 6));
        assertEquals(3, s3208.numberOfAlternatingGroups(new int[]{0, 1, 0, 1, 0}, 3));
    }

    @Test
    void numberOfAlternatingGroups2() {
        S3208 s3208 = new S3208();
        assertEquals(2, s3208.numberOfAlternatingGroups2(new int[]{0, 1, 0, 0, 1, 0, 1}, 6));
        assertEquals(3, s3208.numberOfAlternatingGroups2(new int[]{0, 1, 0, 1, 0}, 3));
    }
}