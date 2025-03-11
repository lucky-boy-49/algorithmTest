package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S2012Test {

    @Test
    void sumOfBeauties() {
        S2012 s2012 = new S2012();
        Assertions.assertEquals(2, s2012.sumOfBeauties(new int[]{1, 2, 3}));
        Assertions.assertEquals(1, s2012.sumOfBeauties(new int[]{2, 4, 6, 4}));
        Assertions.assertEquals(0, s2012.sumOfBeauties(new int[]{3, 2, 1}));
    }
}