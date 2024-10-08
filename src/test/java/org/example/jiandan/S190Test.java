package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S190Test {

    @Test
    void reverseBits() {
        S190 s190 = new S190();
        assertEquals(964176192, s190.reverseBits(43261596));
    }
}