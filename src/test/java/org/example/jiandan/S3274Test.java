package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class S3274Test {

    @Test
    void checkTwoChessboards() {
        S3274 s3274 = new S3274();
        assertTrue(s3274.checkTwoChessboards("a1", "c3"));
        assertFalse(s3274.checkTwoChessboards("a1", "h3"));
        assertTrue(s3274.checkTwoChessboards("h7", "c8"));
    }
}