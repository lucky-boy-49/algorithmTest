package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S3243Test {

    @Test
    void shortestDistanceAfterQueries() {
        S3243 s3243 = new S3243();
        assertArrayEquals(new int[] {3, 2, 1}, s3243.shortestDistanceAfterQueries(5,
                new int[][]{{2,4}, {0,2}, {0,4}}));
    }
}