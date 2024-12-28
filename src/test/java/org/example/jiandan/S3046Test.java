package org.example.jiandan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S3046Test {

    @Test
    void isPossibleToSplit() {
        S3046 s3046 = new S3046();
        Assertions.assertTrue(s3046.isPossibleToSplit(new int[]{1, 1, 2, 2, 3, 4}));
        Assertions.assertFalse(s3046.isPossibleToSplit(new int[]{1, 1, 1, 1}));
    }
}