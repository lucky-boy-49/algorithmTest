package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S3218Test {

    @Test
    void minimumCost() {
        S3218 s3218 = new S3218();
        Assertions.assertEquals(9,
                s3218.minimumCost(1, 7, new int[]{}, new int[]{2, 1, 2, 1, 2, 1}));
    }
}