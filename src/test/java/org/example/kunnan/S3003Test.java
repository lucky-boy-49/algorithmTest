package org.example.kunnan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S3003Test {

    @Test
    void maxPartitionsAfterOperations() {
        var s3003 = new S3003();
        assertEquals(3, s3003.maxPartitionsAfterOperations("accca", 2));
    }
}