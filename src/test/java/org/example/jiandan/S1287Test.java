package org.example.jiandan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S1287Test {

    @Test
    void findSpecialInteger() {
        S1287 s1287 = new S1287();
        Assertions.assertEquals(6, s1287.findSpecialInteger(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}));
        Assertions.assertEquals(6, s1287.findSpecialInteger(new int[]{1}));
    }
}