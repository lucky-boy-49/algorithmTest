package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class S263Test {

    @Test
    void isUgly() {
        S263 s263 = new S263();
        assertTrue(s263.isUgly(6));
    }
}