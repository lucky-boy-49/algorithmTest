package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S191Test {

    @Test
    void hammingWeight() {
        S191 s191 = new S191();
        assertEquals(3, s191.hammingWeight(11));
        assertEquals(1, s191.hammingWeight(128));
        assertEquals(30, s191.hammingWeight(2147483645));
    }
}