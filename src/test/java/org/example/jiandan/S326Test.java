package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class S326Test {

    @Test
    void isPowerOfThree() {
        S326 s326 = new S326();
        assertTrue(s326.isPowerOfThree(27));
    }
}