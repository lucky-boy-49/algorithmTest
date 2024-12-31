package org.example.kunnan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S3219Test {

    @Test
    void minimumCost() {
        S3219 s3219 = new S3219();
        Assertions.assertEquals(13, s3219.minimumCost(3, 2,
                new int[]{1, 3},
                new int[]{5}));
    }
}