package org.example.jiandan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S2239Test {

    @Test
    void findClosestNumber() {
        S2239 s2239 = new S2239();
        Assertions.assertEquals(1, s2239.findClosestNumber(new int[]{-4, -2, 1, 4, 8}));
        Assertions.assertEquals(1, s2239.findClosestNumber(new int[]{2, -1, 1}));
    }
}