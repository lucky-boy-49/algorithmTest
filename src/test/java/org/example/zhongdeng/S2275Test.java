package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S2275Test {

    @Test
    void largestCombination() {
        S2275 s2275 = new S2275();
        Assertions.assertEquals(4, s2275.largestCombination(new int[]{16, 17, 71, 62, 12, 24, 14}));
        Assertions.assertEquals(2, s2275.largestCombination(new int[]{8, 8}));
    }
}