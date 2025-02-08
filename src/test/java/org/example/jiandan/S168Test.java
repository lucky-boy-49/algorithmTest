package org.example.jiandan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S168Test {

    @Test
    void convertToTitle() {
        S168 s168 = new S168();
        Assertions.assertEquals("A", s168.convertToTitle(1));
        Assertions.assertEquals("AB", s168.convertToTitle(28));
        Assertions.assertEquals("ZY", s168.convertToTitle(701));
        Assertions.assertEquals("FXSHRXW", s168.convertToTitle(2147483647));
    }
}