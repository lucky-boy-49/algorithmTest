package org.example.kunnan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S188Test {

    @Test
    void maxProfit() {
        S188 s188 = new S188();
        assertEquals(7, s188.maxProfit(2, new int[] {3,2,6,5,0,3}));
    }
}