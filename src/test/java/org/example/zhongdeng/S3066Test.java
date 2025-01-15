package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S3066Test {

    @Test
    void minOperations() {
        S3066 s3066 = new S3066();
        Assertions.assertEquals(2, s3066.minOperations(new int[]{2, 11, 10, 1, 3}, 10));
        Assertions.assertEquals(4, s3066.minOperations(new int[]{1, 1, 2, 4, 9}, 20));
        Assertions.assertEquals(2, s3066.minOperations(new int[]{1000000000, 999999999, 1000000000, 999999999, 1000000000, 999999999}, 1000000000));
    }
}