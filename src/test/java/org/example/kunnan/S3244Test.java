package org.example.kunnan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S3244Test {

    @Test
    void shortestDistanceAfterQueries() {
        S3244 s3244 = new S3244();
        assertArrayEquals(new int[] {3, 2, 1}, s3244.shortestDistanceAfterQueries(5,
                new int[][]{{2,4}, {0,2}, {0,4}}));
    }
}