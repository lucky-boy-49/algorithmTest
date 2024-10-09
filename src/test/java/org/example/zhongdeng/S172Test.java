package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S172Test {

    @Test
    void trailingZeroes() {
        S172 s172 = new S172();
        assertEquals(49, s172.trailingZeroes(200));
        assertEquals(49, s172.trailingZeroes2(200));
    }

}