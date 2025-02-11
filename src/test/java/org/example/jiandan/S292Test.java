package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class S292Test {

    @Test
    void canWinNim() {
        S292 s292 = new S292();
        assertFalse(s292.canWinNim(4));
    }
}