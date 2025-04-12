package org.example.kunnan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S3272Test {

    @Test
    void countGoodIntegers() {
        S3272 s3272 = new S3272();
        Assertions.assertEquals(2, s3272.countGoodIntegers(1, 4));
        Assertions.assertEquals(27, s3272.countGoodIntegers(3, 5));
        Assertions.assertEquals(9, s3272.countGoodIntegers(2, 1));
    }
}