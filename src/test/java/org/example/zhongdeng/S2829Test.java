package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S2829Test {

    @Test
    void minimumSum() {
        S2829 s2829 = new S2829();
        Assertions.assertEquals(18, s2829.minimumSum(5, 4));
        Assertions.assertEquals(3, s2829.minimumSum(2, 6));
    }
}