package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S3162Test {

    @Test
    void numberOfPairs() {
        S3162 s3162 = new S3162();
        assertEquals(5, s3162.numberOfPairs(new int[]{1, 3, 4}, new int[]{1, 3, 4}, 1));
    }
}