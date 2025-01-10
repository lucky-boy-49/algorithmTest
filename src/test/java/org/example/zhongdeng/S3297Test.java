package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S3297Test {

    @Test
    void validSubstringCount() {
        S3297 s3297 = new S3297();
        assertEquals(1, s3297.validSubstringCount("bcca", "abc"));
        assertEquals(10, s3297.validSubstringCount("abcabc", "abc"));
        assertEquals(0, s3297.validSubstringCount("abcabc", "aaabc"));
    }
}