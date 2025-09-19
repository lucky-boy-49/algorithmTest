package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S3484Test {
    @Test
    void test() {

        S3484 s3484 = new S3484(3);
        assertEquals(12, s3484.getValue("=5+7"));
        s3484.setCell("A1", 10);
        assertEquals(16, s3484.getValue("=A1+6"));
        s3484.setCell("B2", 15);
        assertEquals(25, s3484.getValue("=A1+B2"));
        s3484.resetCell("A1");
        assertEquals(15, s3484.getValue("=A1+B2"));

    }
}