package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S3194Test {

    @Test
    void minimumAverage() {
        S3194 s3194 = new S3194();
        assertEquals(5.5, s3194.minimumAverage(new int[] {7,8,3,4,15,13,4,1}));
    }
}