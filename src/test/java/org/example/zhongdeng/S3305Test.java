package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S3305Test {

    @Test
    void countOfSubstrings() {
        S3305 s3305 = new S3305();
        Assertions.assertEquals(0, s3305.countOfSubstrings("aeioqq", 1));
        Assertions.assertEquals(1, s3305.countOfSubstrings("aeiou", 0));
        Assertions.assertEquals(3, s3305.countOfSubstrings("ieaouqqieaouqq", 1));
        Assertions.assertEquals(3, s3305.countOfSubstrings("iqeaouqi", 2));
        Assertions.assertEquals(2, s3305.countOfSubstrings("ieiaoud", 0));
        Assertions.assertEquals(3, s3305.countOfSubstrings("auieoui", 0));
        Assertions.assertEquals(2, s3305.countOfSubstrings("aboiauee", 0));
    }
}