package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S3258Test {

    @Test
    void countKConstraintSubstrings() {
        S3258 s3258 = new S3258();
        assertEquals(12, s3258.countKConstraintSubstrings("10101", 1));
        assertEquals(25, s3258.countKConstraintSubstrings("1010101", 2));
    }

    @Test
    void countKConstraintSubstrings2() {
        S3258 s3258 = new S3258();
        assertEquals(12, s3258.countKConstraintSubstrings2("10101", 1));
        assertEquals(25, s3258.countKConstraintSubstrings2("1010101", 2));
    }
}