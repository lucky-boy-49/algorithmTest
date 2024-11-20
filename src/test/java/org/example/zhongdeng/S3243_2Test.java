package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S3243_2Test {

    @Test
    void shortestDistanceAfterQueries() {
        S3243_2 s32432 = new S3243_2();
        assertArrayEquals(new int[] {3, 2, 1}, s32432.shortestDistanceAfterQueries(5,
                new int[][]{{2,4}, {0,2}, {0,4}}));
    }
}