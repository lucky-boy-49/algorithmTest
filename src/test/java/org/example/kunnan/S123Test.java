package org.example.kunnan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S123Test {

    @Test
    void maxProfit() {
        S123 s123 = new S123();
        assertEquals(6, s123.maxProfit(new int[]{3,3,5,0,0,3,1,4}));
        assertEquals(7, s123.maxProfit(new int[]{3,2,6,5,0,3}));
    }

}