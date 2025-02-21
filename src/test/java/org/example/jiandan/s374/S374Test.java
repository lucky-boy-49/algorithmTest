package org.example.jiandan.s374;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S374Test {

    @Test
    void guessNumber() {
        S374 s374 = new S374();
        assertEquals(6, s374.guessNumber(10));
    }
}