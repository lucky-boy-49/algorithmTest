package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S3206Test {

    @Test
    void numberOfAlternatingGroups() {
        S3206 s3206 = new S3206();
        assertEquals(0, s3206.numberOfAlternatingGroups(new int[]{1, 1, 1}));
        assertEquals(3, s3206.numberOfAlternatingGroups(new int[]{0, 1, 0, 0, 1}));
    }
}