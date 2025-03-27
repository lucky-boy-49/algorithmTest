package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S2712Test {

    @Test
    void minimumCost() {
        S2712 s2712 = new S2712();
        Assertions.assertEquals(9, s2712.minimumCost("010101"));
        Assertions.assertEquals(2, s2712.minimumCost("0011"));
    }
}