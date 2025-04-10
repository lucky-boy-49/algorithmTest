package org.example.jiandan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S405Test {

    @Test
    void toHex() {
        S405 s405 = new S405();
        Assertions.assertEquals("1a", s405.toHex(26));
        Assertions.assertEquals("ffffffff", s405.toHex(-1));
    }
}