package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class S367Test {

    @Test
    void isPerfectSquare() {
        S367 s367 = new S367();
        assertTrue(s367.isPerfectSquare(16));
        assertFalse(s367.isPerfectSquare(14));
        assertTrue(s367.isPerfectSquare(808201));
        assertFalse(s367.isPerfectSquare(76));
    }
}