package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S3440Test {

    @Test
    void maxFreeTime() {
        S3440 s3440 = new S3440();
        assertEquals(2, s3440.maxFreeTime(
                5,
                new int[]{1, 3},
                new int[]{2, 5}
        ));
        assertEquals(7, s3440.maxFreeTime(
                10,
                new int[]{0, 7, 9},
                new int[]{1, 8, 10}
        ));
        assertEquals(0, s3440.maxFreeTime(
                5,
                new int[]{0, 1, 2, 3, 4},
                new int[]{1, 2, 3, 4, 5}
        ));
        assertEquals(6, s3440.maxFreeTime(
                10,
                new int[]{0, 3, 7, 9},
                new int[]{1, 4, 8, 10}
        ));
    }
}