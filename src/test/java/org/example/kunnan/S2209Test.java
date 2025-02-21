package org.example.kunnan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S2209Test {

    @Test
    void minimumWhiteTiles() {
        S2209 s2209 = new S2209();
        Assertions.assertEquals(2, s2209.minimumWhiteTiles("10110101", 2, 2));
    }
}