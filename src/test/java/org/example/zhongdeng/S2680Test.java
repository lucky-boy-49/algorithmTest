package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S2680Test {

    @Test
    void maximumOr() {
        S2680 s2680 = new S2680();
        Assertions.assertEquals(35, s2680.maximumOr(new int[]{8, 1, 2}, 2));
        Assertions.assertEquals(30, s2680.maximumOr(new int[]{12, 9}, 1));
        Assertions.assertEquals(5759, s2680.maximumOr(new int[]{88, 43, 61, 72, 13}, 6));
    }
}