package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S746Test {

    @Test
    void minCostClimbingStairs() {
        S746 s746 = new S746();
        assertEquals(6, s746.minCostClimbingStairs(new int[] {1,100,1,1,1,100,1,1,100,1}));
    }
}