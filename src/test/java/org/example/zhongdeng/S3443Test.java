package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S3443Test {

    @Test
    void maxDistance() {
        S3443 s3443 = new S3443();
        Assertions.assertEquals(3, s3443.maxDistance("NWSE", 1));
    }
}