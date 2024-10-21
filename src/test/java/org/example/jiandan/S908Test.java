package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S908Test {

    @Test
    void smallestRangeI() {
        S908 s908 = new S908();
        assertEquals(0, s908.smallestRangeI(new int[] {1,3,6}, 3));
    }
}