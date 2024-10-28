package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SLCP55Test {

    @Test
    void getMinimumTime() {
        SLCP55 slcp55 = new SLCP55();
        assertEquals(10, slcp55.getMinimumTime(new int[] {2,3,2}, new int[][] {{0,2}, {1,4}, {2,1}},
                3));
    }
}