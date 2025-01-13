package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S2270Test {

    @Test
    void waysToSplitArray() {
        S2270 s2270 = new S2270();
        Assertions.assertEquals(2, s2270.waysToSplitArray(new int[]{10, 4, -8, 7}));
        Assertions.assertEquals(2, s2270.waysToSplitArray(new int[]{2, 3, 1, 0}));
    }
}