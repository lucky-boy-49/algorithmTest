package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S165Test {

    @Test
    void compareVersion() {
        var s165 = new S165();
        assertEquals(-1, s165.compareVersion("1.2", "1.10"));
        assertEquals(0, s165.compareVersion("1.01", "1.001"));
        assertEquals(0, s165.compareVersion("1.0", "1.0.0.0"));
        assertEquals(1, s165.compareVersion("1.0.1", "1"));
        assertEquals(-1, s165.compareVersion("7.5.2.4", "7.5.3"));
    }
}