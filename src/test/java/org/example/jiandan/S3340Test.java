package org.example.jiandan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S3340Test {

    @Test
    void isBalanced() {
        S3340 s3340 = new S3340();
        Assertions.assertFalse(s3340.isBalanced("1234"));
        Assertions.assertTrue(s3340.isBalanced("24123"));
    }
}