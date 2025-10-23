package org.example.jiandan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S3461Test {

    @Test
    void hasSameDigits() {
        var s3461 = new S3461();
        Assertions.assertTrue(s3461.hasSameDigits("3902"));
    }
}