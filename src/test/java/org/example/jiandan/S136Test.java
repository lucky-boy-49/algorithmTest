package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S136Test {

    @Test
    void singleNumber() {
        S136 s136 = new S136();
        assertEquals(1, s136.singleNumber(new int[]{2, 2, 1}));
        assertEquals(4, s136.singleNumber(new int[]{4, 1, 2, 1, 2}));
        assertEquals(1, s136.singleNumber(new int[]{1}));
    }
}