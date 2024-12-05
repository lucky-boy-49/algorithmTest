package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S3001Test {

    @Test
    void minMovesToCaptureTheQueen() {
        S3001 s3001 = new S3001();
        assertEquals(2, s3001.minMovesToCaptureTheQueen(1, 1, 8, 8, 2, 3));
        assertEquals(1, s3001.minMovesToCaptureTheQueen(5, 3, 3, 4, 5, 2));
    }
}