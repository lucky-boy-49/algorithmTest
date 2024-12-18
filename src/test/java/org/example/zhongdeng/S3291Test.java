package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S3291Test {

    @Test
    void minValidStrings() {
        S3291 s3291 = new S3291();
        assertEquals(3, s3291.minValidStrings(
                new String[]{"abc", "aaaaa", "bcdef"},
                "aabcdabc"));
    }
}