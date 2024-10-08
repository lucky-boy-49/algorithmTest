package org.example.kunnan;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class S502Test {
    @Test
    public void findMaximizedCapital() {
        S502 s502 = new S502();
        int[] profits = {1,2,3};
        int[] capital = {0,1,2};
        assertEquals(126981, s502.findMaximizedCapital(3, 0, profits, capital));
    }
}