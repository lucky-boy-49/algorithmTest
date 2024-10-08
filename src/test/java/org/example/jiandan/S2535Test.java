package org.example.jiandan;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class S2535Test {

    @Test
    public void differenceOfSum() {
        S2535 s2535 = new S2535();
        assertEquals(0, s2535.differenceOfSum(new int[]{1, 2, 3, 4}));
    }
}