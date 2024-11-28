package org.example.kunnan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S3250Test {

    @Test
    void countOfPairs() {
        S3250 s3250 = new S3250();
        assertEquals(272278100, s3250.countOfPairs(new int[]{40, 40, 40, 40, 41, 42, 43, 44, 45, 45}));
    }
}