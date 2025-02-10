package org.example.jiandan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S258Test {

    @Test
    void addDigits() {
        S258 s258 = new S258();
        Assertions.assertEquals(2, s258.addDigits(38));
    }
}