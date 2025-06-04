package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S3403Test {

    @Test
    void answerString() {
        S3403 s3403 = new S3403();
        Assertions.assertEquals("dbc", s3403.answerString("dbca", 2));
        Assertions.assertEquals("g", s3403.answerString("gggg", 4));
        Assertions.assertEquals("if", s3403.answerString("bif", 2));
    }
}