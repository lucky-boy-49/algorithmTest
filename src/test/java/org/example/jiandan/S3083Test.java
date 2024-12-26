package org.example.jiandan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S3083Test {

    @Test
    void isSubstringPresent() {
        S3083 s3083 = new S3083();
        Assertions.assertTrue(s3083.isSubstringPresent("leetcode"));
        Assertions.assertTrue(s3083.isSubstringPresent("abcba"));
        Assertions.assertFalse(s3083.isSubstringPresent("abcd"));
        Assertions.assertFalse(s3083.isSubstringPresent("hozpjlo"));
    }
}