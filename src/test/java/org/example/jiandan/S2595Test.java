package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class S2595Test {

    @Test
    void evenOddBit() {
        S2595 s2595 = new S2595();
        assertArrayEquals(new int[]{1, 2}, s2595.evenOddBit(50));
    }
}