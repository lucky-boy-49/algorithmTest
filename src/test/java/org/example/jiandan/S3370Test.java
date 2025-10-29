package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S3370Test {

    @Test
    void smallestNumber() {
        var s3370 = new S3370();
        assertEquals(7, s3370.smallestNumber(5));
    }
}