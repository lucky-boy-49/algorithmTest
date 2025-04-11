package org.example.jiandan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S415Test {

    @Test
    void addStrings() {
        S415 s415 = new S415();
        Assertions.assertEquals("134", s415.addStrings("11", "123"));
        Assertions.assertEquals("533", s415.addStrings("456", "77"));
        Assertions.assertEquals("0", s415.addStrings("0", "0"));
        Assertions.assertEquals("1111111110", s415.addStrings("123456789", "987654321"));
    }
}