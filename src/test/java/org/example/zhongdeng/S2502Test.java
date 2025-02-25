package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S2502Test {

    @Test
    void test() {
        S2502 s2502 = new S2502(10);
        Assertions.assertEquals(0, s2502.allocate(1, 1));
        Assertions.assertEquals(1, s2502.allocate(1, 2));
        Assertions.assertEquals(2, s2502.allocate(1, 3));
        Assertions.assertEquals(1, s2502.freeMemory(2));
        Assertions.assertEquals(3, s2502.allocate(3, 4));
        Assertions.assertEquals(1, s2502.allocate(1, 1));
        Assertions.assertEquals(6, s2502.allocate(1, 1));
        Assertions.assertEquals(3, s2502.freeMemory(1));
        Assertions.assertEquals(-1, s2502.allocate(10, 2));
        Assertions.assertEquals(0, s2502.freeMemory(7));
    }

}