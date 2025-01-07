package org.example.jiandan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S3019Test {

    @Test
    void countKeyChanges() {
        S3019 s3019 = new S3019();
        Assertions.assertEquals(2, s3019.countKeyChanges("aAbBcC"));
    }
}