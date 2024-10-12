package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S198Test {

    @Test
    void rob() {
        S198 s198 = new S198();
        Assertions.assertEquals(12, s198.rob(new int[]{2, 7, 9, 3, 1}));
    }
}