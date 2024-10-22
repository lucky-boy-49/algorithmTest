package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S3184Test {

    @Test
    void countCompleteDayPairs() {
        S3184 s3184 = new S3184();
        assertEquals(2, s3184.countCompleteDayPairs(new int[] {12,12,30,24,24}));
    }
}