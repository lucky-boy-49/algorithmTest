package org.example.kunnan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S3298Test {

    @Test
    void validSubstringCount() {
        S3298 s3298 = new S3298();
        assertEquals(1, s3298.validSubstringCount("bcca", "abc"));
        assertEquals(10, s3298.validSubstringCount("abcabc", "abc"));
        assertEquals(0, s3298.validSubstringCount("abcabc", "aaabc"));
    }
}