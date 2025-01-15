package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S3066_2Test {

    @Test
    void minOperations() {
        S3066_2 s30662 = new S3066_2();
        Assertions.assertEquals(2, s30662.minOperations(new int[]{2, 11, 10, 1, 3}, 10));
    }
}