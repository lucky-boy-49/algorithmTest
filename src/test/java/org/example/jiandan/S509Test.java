package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S509Test {

    @Test
    void fib() {
        S509 s509 = new S509();
        assertEquals(0, s509.fib(0));
        assertEquals(1, s509.fib(1));
        assertEquals(3, s509.fib(4));
    }
}