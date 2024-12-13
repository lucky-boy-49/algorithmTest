package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class S3264Test {

    @Test
    void getFinalState() {
        S3264 s3264 = new S3264();
        assertArrayEquals(new int[]{8, 4, 6, 5, 6},
                s3264.getFinalState(new int[]{2, 1, 3, 5, 6}, 5, 2));
    }
}