package org.example.jiandan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S3065Test {

    @Test
    void minOperations() {
        S3065 s3065 = new S3065();
        Assertions.assertEquals(0, s3065.minOperations(new int[]{1, 1, 2, 4, 9}, 1));
        Assertions.assertEquals(3, s3065.minOperations(new int[]{2, 11, 10, 1, 3}, 10));
        Assertions.assertEquals(4, s3065.minOperations(new int[]{1, 1, 2, 4, 9}, 9));
    }
}