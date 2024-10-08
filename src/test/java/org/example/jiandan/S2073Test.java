package org.example.jiandan;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class S2073Test {
    @Test
    public void timeRequiredToBuy() {
        S2073 s2073 = new S2073();
        assertEquals(6, s2073.timeRequiredToBuy(new int[] {5,1,1,1}, 0));
    }
}