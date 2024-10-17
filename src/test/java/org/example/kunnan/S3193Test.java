package org.example.kunnan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S3193Test {

    @Test
    void numberOfPermutations() {
        S3193 s3193 = new S3193();
        assertEquals(2, s3193.numberOfPermutations(3, new int[][] {{2, 2}, {0, 0}}));
    }
}