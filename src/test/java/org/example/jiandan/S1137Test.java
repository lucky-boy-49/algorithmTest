package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S1137Test {

    @Test
    void tribonacci() {
        S1137 s1137 = new S1137();
        assertEquals(4, s1137.tribonacci(4));
    }
}