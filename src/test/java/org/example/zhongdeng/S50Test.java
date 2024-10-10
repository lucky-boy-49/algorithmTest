package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S50Test {

    @Test
    void myPow() {
        S50 s50 = new S50();
        Assertions.assertEquals(3e-05, s50.myPow(34.00515, -3));
    }
}