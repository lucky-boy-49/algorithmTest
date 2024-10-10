package org.example.jiandan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class S69Test {
    @Test
    void mySqrt() {
        S69 s69 = new S69();
        Assertions.assertEquals(46340, s69.mySqrt2(1));
    }
}