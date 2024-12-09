package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class S1312Test {

    @Test
    void squareIsWhite() {
        S1312 s1312 = new S1312();
        assertFalse(s1312.squareIsWhite("a1"));
        assertTrue(s1312.squareIsWhite("h3"));
        assertFalse(s1312.squareIsWhite("c7"));
    }
}