package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S3200Test {
    @Test
    void maxHeightOfTriangle() {
        S3200 s3200 = new S3200();
        assertEquals(3, s3200.maxHeightOfTriangle(2, 4));
    }
}