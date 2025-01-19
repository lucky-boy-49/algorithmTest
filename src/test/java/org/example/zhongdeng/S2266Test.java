package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S2266Test {

    @Test
    void countTexts() {
        S2266 s2266 = new S2266();
        Assertions.assertEquals(8, s2266.countTexts("22233"));
        Assertions.assertEquals(82876089, s2266.countTexts("222222222222222222222222222222222222"));
    }
}