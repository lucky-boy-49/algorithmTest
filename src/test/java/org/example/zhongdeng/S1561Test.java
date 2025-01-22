package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S1561Test {

    @Test
    void maxCoins() {
        S1561 s1561 = new S1561();
        Assertions.assertEquals(9, s1561.maxCoins(new int[]{2, 4, 1, 2, 7, 8}));
        Assertions.assertEquals(4, s1561.maxCoins(new int[]{2, 4, 5}));
        Assertions.assertEquals(18, s1561.maxCoins(new int[]{9, 8, 7, 6, 5, 1, 2, 3, 4}));
    }
}