package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S1716Test {

    @Test
    void totalMoney() {
        var s1716 = new S1716();
        assertEquals(10, s1716.totalMoney(4));
        assertEquals(37, s1716.totalMoney(10));
        assertEquals(96, s1716.totalMoney(20));
    }
}