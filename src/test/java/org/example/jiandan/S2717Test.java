package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S2717Test {

    @Test
    void semiOrderedPermutation() {
        S2717 s2717 = new S2717();
        assertEquals(2, s2717.semiOrderedPermutation(new int[]{2, 1, 4, 3}));
        assertEquals(3, s2717.semiOrderedPermutation(new int[]{2, 4, 1, 3}));
        assertEquals(0, s2717.semiOrderedPermutation(new int[]{1, 3, 4, 2, 5}));
    }
}