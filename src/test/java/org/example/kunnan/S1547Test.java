package org.example.kunnan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S1547Test {

    @Test
    void minCost() {
        S1547 s1547 = new S1547();
        assertEquals(22, s1547.minCost(9, new int[] {5,6,1,4,2}));
    }
}