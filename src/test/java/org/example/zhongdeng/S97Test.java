package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S97Test {

    @Test
    void isInterleave() {
        S97 s97 = new S97();
        Assertions.assertFalse(s97.isInterleave("db", "b", "cbb"));
    }
}