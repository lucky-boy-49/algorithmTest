package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class S231Test {

    @Test
    void isPowerOfTwo() {
        S231 s231 = new S231();
        assertTrue(s231.isPowerOfTwo(2));
        assertTrue(s231.isPowerOfTwo(1));
        assertTrue(s231.isPowerOfTwo(16));
        assertFalse(s231.isPowerOfTwo(3));
        assertFalse(s231.isPowerOfTwo(2147483647));
    }
}