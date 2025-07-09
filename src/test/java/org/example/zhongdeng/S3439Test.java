package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S3439Test {

    @Test
    void maxFreeTime() {
        S3439 s3439 = new S3439();
        Assertions.assertEquals(2, s3439
                .maxFreeTime(5, 1,
                        new int[]{1, 3},
                        new int[]{2, 5})
        );
        Assertions.assertEquals(6, s3439
                .maxFreeTime(10, 1,
                        new int[]{0, 2, 9},
                        new int[]{1, 4, 10})
        );
        Assertions.assertEquals(0, s3439
                .maxFreeTime(5, 2,
                        new int[]{0, 1, 2, 3, 4},
                        new int[]{1, 2, 3, 4, 5})
        );
        Assertions.assertEquals(18, s3439
                .maxFreeTime(34, 2,
                        new int[]{0, 17},
                        new int[]{14, 19})
        );
        Assertions.assertEquals(7, s3439
                .maxFreeTime(21, 1,
                        new int[]{7, 10, 16},
                        new int[]{10, 14, 18})
        );
        Assertions.assertEquals(2, s3439
                .maxFreeTime(30, 2,
                        new int[]{1, 15, 17},
                        new int[]{14, 17, 29})
        );
    }
}