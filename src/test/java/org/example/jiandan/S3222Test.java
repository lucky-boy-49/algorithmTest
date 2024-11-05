package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S3222Test {

    @Test
    void losingPlayer() {
        S3222 s3222 = new S3222();
        assertEquals("Alice", s3222.losingPlayer(2, 7));
        assertEquals("Bob", s3222.losingPlayer(4, 11));
    }
}