package org.example.jiandan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S2843Test {

    @Test
    void countSymmetricIntegers() {
        S2843 s2843 = new S2843();
        Assertions.assertEquals(9, s2843.countSymmetricIntegers(1, 100));
        Assertions.assertEquals(4, s2843.countSymmetricIntegers(1200, 1230));
    }
}