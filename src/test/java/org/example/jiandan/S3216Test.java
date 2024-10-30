package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S3216Test {

    @Test
    void getSmallestString() {
        S3216 s3216 = new S3216();
        assertEquals("001", s3216.getSmallestString("001"));
    }
}