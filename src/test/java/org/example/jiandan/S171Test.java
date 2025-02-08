package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S171Test {

    @Test
    void titleToNumber() {
        S171 s171 = new S171();
        assertEquals(28, s171.titleToNumber("AB"));
        assertEquals(701, s171.titleToNumber("ZY"));
    }
}