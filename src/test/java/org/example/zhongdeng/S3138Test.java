package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S3138Test {

    @Test
    void minAnagramLength() {
        S3138 s3138 = new S3138();
        Assertions.assertEquals(2, s3138.minAnagramLength("abba"));
        Assertions.assertEquals(4, s3138.minAnagramLength("cdef"));
        Assertions.assertEquals(1, s3138.minAnagramLength("jjj"));
        Assertions.assertEquals(8, s3138.minAnagramLength("nghuxkkd"));
        Assertions.assertEquals(6, s3138.minAnagramLength("abbbaa"));
    }
}