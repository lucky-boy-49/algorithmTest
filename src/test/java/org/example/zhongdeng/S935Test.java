package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S935Test {

    @Test
    void knightDialer() {
        S935 s935 = new S935();
        assertEquals(10, s935.knightDialer(1));
        assertEquals(20, s935.knightDialer(2));
        assertEquals(136006598, s935.knightDialer(3131));
    }
}