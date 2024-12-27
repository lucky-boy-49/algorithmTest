package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S3159Test {

    @Test
    void occurrencesOfElement() {
        S3159 s3159 = new S3159();
        Assertions.assertArrayEquals(new int[]{-1, -1, 1, -1, -1, 7, 1, -1},
                s3159.occurrencesOfElement(new int[]{1, 3, 2, 2, 3, 3, 1, 3, 1},
                        new int[]{5, 6, 1, 5, 6, 4, 1, 5},
                        3));
    }

    @Test
    void occurrencesOfElement2() {
        S3159 s3159 = new S3159();
        Assertions.assertArrayEquals(new int[]{-1, -1, 1, -1, -1, 7, 1, -1},
                s3159.occurrencesOfElement2(new int[]{1, 3, 2, 2, 3, 3, 1, 3, 1},
                        new int[]{5, 6, 1, 5, 6, 4, 1, 5},
                        3));
    }
}