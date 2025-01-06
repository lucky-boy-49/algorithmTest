package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S2274Test {

    @Test
    void maxConsecutive() {
        S2274 s2274 = new S2274();
        Assertions.assertEquals(3, s2274.maxConsecutive(2, 9, new int[]{4, 6}));
        Assertions.assertEquals(0, s2274.maxConsecutive(6, 8, new int[]{7, 6, 8}));
        Assertions.assertEquals(12, s2274.maxConsecutive(28, 50, new int[]{35, 48}));
    }
}