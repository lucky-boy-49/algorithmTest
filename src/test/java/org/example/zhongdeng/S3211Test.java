package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class S3211Test {

    @Test
    void validStrings() {
        S3211 s3211 = new S3211();
        assertLinesMatch(Arrays.asList("010","011","101","110","111"), s3211.validStrings(3));
    }
}