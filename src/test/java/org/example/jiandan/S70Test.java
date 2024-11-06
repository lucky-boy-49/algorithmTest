package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S70Test {

    @Test
    void climbStairs() {
        S70 s70 = new S70();
        assertEquals(2, s70.climbStairs(2));
        assertEquals(3, s70.climbStairs(3));
    }
}