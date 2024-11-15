package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S3239Test {

    @Test
    void minFlips() {
        S3239 s3239 = new S3239();
        assertEquals(2, s3239.minFlips(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips(new int[][]{{1}, {0}}));
    }

    @Test
    void minFlips2() {
        S3239 s3239 = new S3239();
        assertEquals(2, s3239.minFlips2(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips2(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips2(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips2(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips2(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips2(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips2(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips2(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips2(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips2(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips2(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips2(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips2(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips2(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips2(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips2(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips2(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips2(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips2(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips2(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips2(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips2(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips2(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips2(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips2(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips2(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips2(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips2(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips2(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips2(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips2(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips2(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips2(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips2(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips2(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips2(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips2(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips2(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips2(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips2(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips2(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips2(new int[][]{{1}, {0}}));
        assertEquals(2, s3239.minFlips2(new int[][]{{1,0,0}, {0,0,0}, {0,0,1}}));
        assertEquals(1, s3239.minFlips2(new int[][]{{0,1}, {0,1}, {0,0}}));
        assertEquals(0, s3239.minFlips2(new int[][]{{1}, {0}}));
    }
}