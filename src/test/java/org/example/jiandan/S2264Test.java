package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S2264Test {

    @Test
    void largestGoodInteger() {
        S2264 s2264 = new S2264();
        assertEquals("777", s2264.largestGoodInteger("6777133339"));
        assertEquals("000", s2264.largestGoodInteger("2300019"));
        assertEquals("", s2264.largestGoodInteger("42352338"));
    }
}