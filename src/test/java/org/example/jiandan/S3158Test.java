package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S3158Test {

    @Test
    void duplicateNumbersXOR() {
        S3158 s3158 = new S3158();
        assertEquals(24, s3158.duplicateNumbersXOR(new int[]{10, 18, 7, 10, 18}));
    }
}