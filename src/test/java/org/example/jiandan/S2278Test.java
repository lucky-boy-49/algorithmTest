package org.example.jiandan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S2278Test {

    @Test
    void percentageLetter() {
        S2278 s2278 = new S2278();
        Assertions.assertEquals(33, s2278.percentageLetter("foobar", 'o'));
    }
}