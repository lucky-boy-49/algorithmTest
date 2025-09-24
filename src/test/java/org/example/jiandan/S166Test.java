package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S166Test {

    @Test
    void fractionToDecimal() {
        var s166 = new S166();
        assertEquals("0.5", s166.fractionToDecimal(1, 2));
        assertEquals("2", s166.fractionToDecimal(2, 1));
        assertEquals("0.(012)", s166.fractionToDecimal(4, 333));
        assertEquals("0.1(6)", s166.fractionToDecimal(1, 6));
        assertEquals("0.(003)", s166.fractionToDecimal(1, 333));
        assertEquals("-6.25", s166.fractionToDecimal(-50, 8));
        assertEquals("-6.25", s166.fractionToDecimal(-1, -2147483648));
    }
}