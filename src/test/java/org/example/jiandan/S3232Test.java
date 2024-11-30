package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class S3232Test {

    @Test
    void canAliceWin() {
        S3232 s3232 = new S3232();
        assertFalse(s3232.canAliceWin(new int[]{1, 2, 3, 4, 10}));
        assertTrue(s3232.canAliceWin(new int[]{1, 2, 3, 4, 5, 14}));
        assertTrue(s3232.canAliceWin(new int[]{5, 5, 5, 25}));
    }
}