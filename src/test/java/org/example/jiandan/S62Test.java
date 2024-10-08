package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S62Test {

    @Test
    void addBinary() {
        S62 s62 = new S62();
        assertEquals("10101", s62.addBinary("1010", "1011"));
    }
}